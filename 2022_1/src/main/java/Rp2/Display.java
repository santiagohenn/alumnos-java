package Rp2;

import javax.swing.*;

public class Display {

    JFrame jf = new JFrame();
    JLabel text = new JLabel();

    public Display(int w, int h) {

        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.setVisible(true);

        jf.add(text);
        jf.setSize(w, h);

    }

    public void mostrar(String mensaje) {
        text.setText(mensaje);
    }

}
