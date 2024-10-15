// Manejo de archivos
import java.io.*;

public class ManejoArchivos {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("archivo.txt");
            writer.write("Hola, archivo!");
            writer.close();
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo");
        }
    }
}
