package rextp2;

import javax.swing.*;
import java.util.List;

public class Display {

    JFrame jf = new JFrame();
    JLabel text = new JLabel();

    public static void main(String args[]){
        Display display = new Display(600, 100);
        Decodificador deco = new Decodificador();
        List<String> lista = deco.leerArchivo("C:\\Projects\\alumnos-java\\2022_1\\coded.txt");
        String decoded = deco.decodificar(lista.get(12));
        display.mostrar(decoded);
    }

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
