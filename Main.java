/*
 * Universidad del Valle de Guatemala
 * POO - seccion 30
 * Roberto Barreda 23354 y Javier España 23361
 */

/**
 * Clase principal que contiene el método main para probar el sistema.
 */

import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class Main {
    public static void main(String[] args) {
        String filePath = "catalog.csv"; // Ruta de tu archivo CSV de entrada
        String outputFilePath = "referencias.csv"; // Ruta del archivo de salida

        Catalogo catalogo = new Catalogo();
        catalogo.cargarDesdeCSV(filePath);

        for (MaterialBibliografico material : catalogo.getListaMateriales()) {
            String cita = material.getCita(); 
            System.out.println(cita); 
        }

        // Guardar el catálogo actualizado en un archivo CSV
        catalogo.guardarEnCSV(outputFilePath);
    }
}