import javax.swing.*;

// Clase para crear una ventana simple
public class VentanaSimple {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Mi Ventana");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
