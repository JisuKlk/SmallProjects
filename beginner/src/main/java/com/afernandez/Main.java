package com.afernandez;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Main {

    // Declaramos un int para el contador y lo declaramos en 0 ya que es el valor que hemos introducido en el jtext
    static int counter = 0;

    public static void main(String[] args) {

        // Crear el JFrame
        JFrame jFrame = new JFrame("AWT Counter");

        // Declaramos el exit on close
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Le damos un tamaño cualquiera
        jFrame.setSize(400, 300);

        // Ponemos un layout para que no se sobrepongan las cosas
        jFrame.setLayout(null);

        // Crear la jLabel (el texto)
        JLabel jLabel = new JLabel("Counter:");
        // Le damos forma
        jLabel.setBounds(50, 50, 100, 30);
        // La metemos al jframe d antes
        jFrame.add(jLabel);

        // Crear la caja de texto (la caja) y le declaramos el contenido (0)
        JTextField jText = new JTextField("0");
        // Le damos forma
        jText.setBounds(150, 50, 100, 30);
        // Segun la imagen y las instrucciones he deducido que no ha de ser editable
        jText.setEditable(false);
        // Lo metemos al Jframe tmb
        jFrame.add(jText);

        // Creamos el botón
        JButton button = new JButton("Count up");
        // Le damos forma
        button.setBounds(50, 100, 120, 30);
        // Lo metemos tmb al jframe
        jFrame.add(button);

        JButton button2 = new JButton("Count down");
        button2.setBounds(200, 100, 120, 30);

        JButton button3 = new JButton("Reset");
        button3.setBounds(125, 150, 120, 30);

        jFrame.add(button2);
        jFrame.add(button3);

        // Añadir ActionListener al botón para que tenga una interacción y tal
        button.addActionListener(new ActionListener() {
            // Y hacemos un metodo que incremente el numero en 1 cada vez que reciba un
            // click
            @Override
            public void actionPerformed(ActionEvent e) {
                counter++;
                // Le cambiamos el texto al jtext con el valor actual del contador
                jText.setText(String.valueOf(counter));
            }
        });

        button2.addActionListener(new ActionListener() {

            // Y hacemos un metodo que incremente el numero en 1 cada vez que reciba un
            // click
            @Override
            public void actionPerformed(ActionEvent e) {
                counter--;
                // Le cambiamos el texto al jtext con el valor actual del contador
                jText.setText(String.valueOf(counter));
            }
        });

        button3.addActionListener(new ActionListener() {

            // Y hacemos un metodo que incremente el numero en 1 cada vez que reciba un
            // click
            @Override
            public void actionPerformed(ActionEvent e) {
                counter = 0;
                // Le cambiamos el texto al jtext con el valor actual del contador
                jText.setText(String.valueOf(counter));
            }
        });

        // Hacemos visible la ventana pq sino, no sirve de nada todo lo anterior
        jFrame.setVisible(true);
    }
}
