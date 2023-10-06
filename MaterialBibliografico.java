/*
 * Universidad del Valle de Guatemala
 * POO - seccion 30
 * Roberto Barreda 23354 y Javier España 23361
 */

import java.util.*;
import java.io.*;


class MaterialBibliografico {
    private String tipo;
    private String titulo;
    private String nombreorg;
    private String fecha;
    private String apellido;
    private String nombre;
    private String volumen;
    private String numero;
    private String pagi;
    private String pagf;
    private String url;
    private String cita;

    public MaterialBibliografico(String tipo, String titulo, String nombreorg, String fecha, String apellido, String nombre, String volumen, String numero, String pagi, String pagf, String url) {
        this.tipo = tipo;
        this.titulo = titulo;
        this.nombreorg = nombreorg;
        this.fecha = fecha;
        this.apellido = apellido;
        this.nombre = nombre;
        this.volumen = volumen;
        this.numero = numero;
        this.pagi = pagi;
        this.pagf = pagf;
        this.url = url;
        generarReferenciaAPA();
    }
   

    public String getCita() {
        return cita;
    }

    private void generarReferenciaAPA() {
        if (tipo.equals("libro")) {
            cita = apellido + ", " + nombre.charAt(0) + ". (" + fecha + "). " + titulo + ". " + nombreorg + ". " + url;
        } else if (tipo.equals("periodico")) {
            cita = apellido + ", " + nombre.charAt(0) + ". (" + fecha + "). " + titulo + ". " + nombreorg + ". " + url;
        } else if (tipo.equals("tesis")) {
            cita = apellido + ", " + nombre.charAt(0) + ". (" + fecha + "). " + titulo + ". " + nombreorg + ". " + url;        
        } else if (tipo.equals("pagina web")) {
            cita = apellido + ", " + nombre.charAt(0) + ". (" + fecha + "). " + titulo + ". " + nombreorg + ". " + url;
        } else if (tipo.equals("revista")) {
            cita = apellido + ", " + nombre.charAt(0) + ". (" + fecha + "). " + titulo + ". " + nombreorg + ". " + volumen + "(" + numero + "), " + pagi + " - " + pagf + ". " + url;
        }
        // Implementa lógica para otros tipos de materiales aquí
    }

    public String toCSVString() {
        // Implementa la lógica para convertir este objeto en una cadena CSV
        return tipo + "," + titulo + "," + nombreorg + "," + fecha + "," + apellido + "," + nombre + "," + volumen + "," + numero + "," + pagi + "," + pagf + "," + url + "," + cita;
    }

    public static MaterialBibliografico fromCSVString(String line) {
        String[] parts = line.split(",");
        String tipo = parts[0];
        String titulo = parts[1];
        String nombreorg = parts[2];
        String fecha = parts[3];
        String apellido = parts[4];
        String nombre = parts[5];
        String volumen = parts[6];
        String numero = parts[7];
        String pagi = parts[8];
        String pagf = parts[9];
        String url = parts[10];

        MaterialBibliografico material = new MaterialBibliografico(tipo, titulo, nombreorg, fecha, apellido, nombre, volumen, numero, pagi, pagf, url);

        return material;
    }
}


