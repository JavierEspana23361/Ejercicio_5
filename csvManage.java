import java.util.*;
import java.io.*;

public class csvManage {
    public static void savecita(String cita) {
        try {
            FileWriter writer = new FileWriter("example.csv", true);
            writer.write(cita);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
