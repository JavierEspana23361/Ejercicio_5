/*
 * Universidad del Valle de Guatemala
 * POO - seccion 30
 * Roberto Barreda 23354 y Javier España 23361
 */

/**
 * Clase que organiza y gestiona la colección de materiales bibliográficos.
 */
import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


class Catalogo {
    private List<MaterialBibliografico> listaMateriales;

    public Catalogo() {
        listaMateriales = new ArrayList<>();
    }

    public void agregarMaterial(MaterialBibliografico material) {
        listaMateriales.add(material);
    }

    public List<MaterialBibliografico> getListaMateriales() {
        return listaMateriales;
    }

    public void cargarDesdeCSV(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                MaterialBibliografico material = MaterialBibliografico.fromCSVString(line);
                listaMateriales.add(material);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void guardarEnCSV(String filePath) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filePath))) {
            for (MaterialBibliografico material : listaMateriales) {
                writer.println(material.toCSVString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}