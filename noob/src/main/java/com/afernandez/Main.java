package com.afernandez;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Main {
    public static void main(String[] args) {

        // Crear el JFrame
        JFrame jFrame = new JFrame("AWT Counter");

        // Declaramos el exit on close
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Le damos un tamaño cualquiera
        jFrame.setSize(300, 200);

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
        JButton button = new JButton("Count");
        // Le damos forma
        button.setBounds(100, 100, 100, 30);
        // Lo metemos tmb al jframe
        jFrame.add(button);

        // Añadir ActionListener al botón para que tenga una interacción y tal
        button.addActionListener(new ActionListener() {
            // Declaramos un int para el contador y lo declaramos en 0 ya que es el valor que hemos introducido en el jtext
            private int counter = 0;

            // Y hacemos un metodo que incremente el numero en 1 cada vez que reciba un click
            @Override
            public void actionPerformed(ActionEvent e) {
                counter++;
                // Le cambiamos el texto al jtext con el valor actual del contador
                jText.setText(String.valueOf(counter));
            }
        });

        // Hacemos visible la ventana pq sino, no sirve de nada todo lo anterior
        jFrame.setVisible(true);
    }
}
