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

    /**
     * Constructor para crear un catálogo vacío.
     */
    public Catalogo() {
        listaMateriales = new ArrayList<>();
    }

    /**
     * Agrega un material al catálogo.
     *
     * @param material El material bibliográfico a agregar.
     */
    public void agregarMaterial(MaterialBibliografico material) {
        listaMateriales.add(material);
    }

    /**
     * Genera la referencia APA para un material específico.
     *
     * @param material El material para el que se generará la referencia APA.
     * @return La referencia APA generada.
     */
    public String generarReferenciaAPA(MaterialBibliografico material) {
        // Lógica para generar la referencia APA para un material específico
        // Aquí debes implementar la lógica completa según las reglas de APA 7ma edición
        return "Referencia APA para " + material.getNombre();
    }

    /**
     * Cuenta la cantidad de materiales por género.
     *
     * @return Un mapa con la cantidad de materiales por género.
     */
    public Map<String, Integer> contarPorGenero() {
        Map<String, Integer> contadorPorGenero = new HashMap<>();

        for (MaterialBibliografico material : listaMateriales) {
            String género = material.getGénero();
            contadorPorGenero.put(género, contadorPorGenero.getOrDefault(género, 0) + 1);
        }

        return contadorPorGenero;
    }

    /**
     * Cuenta la cantidad de materiales por autor.
     *
     * @return Un mapa con la cantidad de materiales por autor.
     */
    public Map<String, Integer> contarPorAutor() {
        Map<String, Integer> contadorPorAutor = new HashMap<>();

        for (MaterialBibliografico material : listaMateriales) {
            String autor = material.getAutor();
            contadorPorAutor.put(autor, contadorPorAutor.getOrDefault(autor, 0) + 1);
        }

        return contadorPorAutor;
    }

    /**
     * Cuenta la cantidad de materiales por año de publicación.
     *
     * @return Un mapa con la cantidad de materiales por año de publicación.
     */
    public Map<Integer, Integer> contarPorAño() {
        Map<Integer, Integer> contadorPorAño = new HashMap<>();

        for (MaterialBibliografico material : listaMateriales) {
            int año = material.getAñoPublicacion();
            contadorPorAño.put(año, contadorPorAño.getOrDefault(año, 0) + 1);
        }

        return contadorPorAño;
    }

    /**
     * Muestra el catálogo en formato APA.
     *
     * @return Una cadena con las referencias APA de todos los materiales en el catálogo.
     */
    public String mostrarCatalogoAPA() {
        StringBuilder catalogoAPA = new StringBuilder();

        for (MaterialBibliografico material : listaMateriales) {
            catalogoAPA.append(generarReferenciaAPA(material)).append("\n");
        }

        return catalogoAPA.toString();
    }

    /**
     * Guarda el catálogo en un archivo CSV sin usar librerías externas.
     *
     * @param filePath La ruta del archivo CSV donde se guardará el catálogo.
     */
    public void guardarEnCSV(String filePath) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filePath))) {
            for (MaterialBibliografico material : listaMateriales) {
                writer.println(material.toCSVString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Carga el catálogo desde un archivo CSV sin usar librerías externas.
     *
     * @param filePath La ruta del archivo CSV desde donde se cargará el catálogo.
     */
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
}