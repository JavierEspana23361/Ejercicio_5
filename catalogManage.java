import java.util.ArrayList;
import java.io.*;

public class catalogManage {
    static csvManage csv = new csvManage();
    static String fileName = "example.csv";

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
}
