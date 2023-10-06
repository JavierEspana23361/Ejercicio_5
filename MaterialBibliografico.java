/*
 * Universidad del Valle de Guatemala
 * POO - seccion 30
 * Roberto Barreda 23354 y Javier España 23361
 */

import java.util.*;
import java.io.*;

public class MaterialBibliografico {
    static Catalogo csv = new Catalogo();
    static String fileName = "example.csv";

    public MaterialBibliografico(String string, String string2, int i, String string3, String string4, String string5) {
    }

    public static void main(String[] args) {
        String tipo;
        tipo = "xd";
        if (tipo == "libro"){
            String cita = /* apellido + ", " + inicial + "." + " (" + año + "). " + titulo + ". " + editorial + ". " + url */"";
        }
        else if (tipo == "artículo"){
            
        }
        else if (tipo == "periódico"){
            String cita = /* apellido + ", " + inicial + "." + " (" + fechapubli + "). " + titular + ". " + nombreperiodic + ". " + url */"";
        }
        else if (tipo == "tesis"){
            String cita = /* apellido + ", " + inicial + "." + " (" + año + "). " + titulo + ". " + institucion + ". " */"";        
        }
        else if (tipo == "página web"){
            String cita = /* apellido + ", " + inicial + "." + " (" + fechapubli + "). " + tituloartículo + ". " + nombresitio + ". " + url */"";
        }
        else if (tipo == "revista"){
            String cita = /* apellido + ", " + inicial + "." + " (" + año + "). " + tituloartículo + ". " + titulorevista + ", " + volumen + "(" + numrevista + "), " + numpaginicio + " - " + numpagfin + ". " + url */"";
        }
        savecita(cita);
    }

    public String getNombre() {
        return null;
    }

    public String getGénero() {
        return null;
    }

    public String getAutor() {
        return null;
    }

    public int getAñoPublicacion() {
        return 0;
    }

    public char[] toCSVString() {
        return null;
    }

    public static MaterialBibliografico fromCSVString(String line) {
        return null;
    }
}
