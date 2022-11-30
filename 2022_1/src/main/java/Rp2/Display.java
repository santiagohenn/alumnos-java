package Rp2;/*
 * Nombre y Apellido: Leandro Beltran
 * DNI: 39.595.480
 */

import javax.swing.*;
import java.util.List;

public class Display { // NO MODIFICAR

    JFrame jf = new JFrame(); // NO MODIFICAR
    JLabel text = new JLabel(); // NO MODIFICAR

    public static void main(String args[]){

        // 1 -> Instanciar un objeto Display con el nombre display y un tamaño de 600 x 100
        Display display = new Display(100, 600);

        // 2 -> Instanciar un objeto Decodificador con el nombre deco
        Decodificador deco = new Decodificador();

        // NO TOCAR LA SIGUIENTE INSTRUCCION
        List<String> lista = deco.leerArchivo("coded.txt");

        // 3 -> Almacenar en coded, el resultado de ejecutar un get sobre lista
        // con las ultimas dos cifras de tu DNI
        String coded = lista.get(80);

        // 4 -> Almacenar en decoded, el resultado de llamar al método decodificar
        // con la String coded como parámetro
        String decoded = coded;

        // Ejecutar el método mostrar del objeto display con la String decoded como parámetro
        /*Completar*/
        display.mostrar(decoded);


      
    }

    public Display(int w, int h) {

        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.setVisible(true);

        // Llamar al método setSize del JFrame jf con los valores w y h correspondientemente
        jf.setSize(w, h);

        // Añadir al JFrame jf mediante el método add, el JLabel text
       jf.add(text);

    }

    public void mostrar(String mensaje) {
        // setear el texto de la JLabel text con el setter correspondiente, utilizando mensaje como 
        // parámetro
        text.setText(mensaje);/* Completar */
    }

}
