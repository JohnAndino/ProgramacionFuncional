package ec.edu.uce;

/*
*
* @author John Andino
*
 */

import ec.edu.uce.figuras.Circulo;
import ec.edu.uce.figuras.Cuadrado;
import ec.edu.uce.figuras.Triangulo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        // Crea el frame
        JFrame frame = new JFrame("Selecciona una forma");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Crea los botones
        JButton squareButton = new JButton("Cuadrado");
        JButton circleButton = new JButton("Círculo");
        JButton triangleButton = new JButton("Triángulo");

        // Crea el panel y añade los botones
        JPanel panel = new JPanel();
        panel.add(squareButton);
        panel.add(circleButton);
        panel.add(triangleButton);

        // Añade el panel al frame
        frame.add(panel);
        frame.setVisible(true);

        // Añade ActionListeners a los botones
        squareButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Cuadrado().main(args);
            }
        });

        circleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Circulo().main(args);            }
        });

        triangleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Triangulo().main(args);
            }
        });
    }
}
