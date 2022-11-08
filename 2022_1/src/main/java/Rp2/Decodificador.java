package Rp2;

import javax.swing.*;
import java.awt.*;

public class Decodificador {

    static JFrame jf = new JFrame();

    public static void main(String[] args) {

        display("Hola");

    }

    public static void display(String mensaje) {

        jf.setVisible(true);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.setSize(300, 200);
        JLabel texto = new JLabel();
        jf.add(texto);
        texto.setText(mensaje);

    }

}
