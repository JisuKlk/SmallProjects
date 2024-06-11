package com.afernandez;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main {
    public static void main(String[] args) {
        // Creamos el jframe
        JFrame jFrame = new JFrame("AWT Factorial");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(400, 100);

        // Creamos un jPanel de paso, esto ayuda a organizar las cosas
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new FlowLayout());

        // Crear las etiquetas de texto
        JLabel jLabel = new JLabel("Enter a positive integer:");
        JLabel jLabel2 = new JLabel("Factorial is:");

        // Creamos los jtext
        JTextField jText = new JTextField(10);
        JTextField jText2 = new JTextField(10);

        // Hacemos que el segundo no sea editable (es el resultado)
        jText2.setEditable(false);

        // Le damos un actionlistener al primer jtext (en el que introducimos los datos)
        jText.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Recogemos el texto
                String inputText = jText.getText();
                // Por si tal, revisamos que no este vacio
                if (!inputText.isEmpty()) {
                    try {
                        // Como es una caja de texto, lo pasamos a int
                        int number = Integer.parseInt(inputText);
                        if (number >= 0) {
                            // Si el numero es positivo, calculamos la factorial y la pasamos a texto
                            jText2.setText(Integer.toString(calculateFactorial(number)));
                        } else {
                            // Si no, fiumba mensaje de 'error'
                            jText2.setText("Enter a positive integer");
                        }
                    } catch (NumberFormatException ex) {
                        // Si tal, excepcion de que no es un numero
                        jText2.setText("Invalid input");
                    }
                } else {
                    // Si esta vacio ps no se calcula la factorial
                    jText2.setText("");
                }
            }
        });

        // Añadimos el temita al panel
        jPanel.add(jLabel);
        jPanel.add(jText);
        jPanel.add(jLabel2);
        jPanel.add(jText2);

        // Añadimos todo el panel al jframe
        jFrame.add(jPanel);

        // Y ps lo hacemos visible
        jFrame.setVisible(true);
    }

    // Método para calcular el factorial de un número (no voy a mentir, este lo he sacado de stack overflow)
    public static int calculateFactorial(int n) {
        int factorial = 1;
        for (int i = 2; i <= n; ++i) {
          factorial *= i;
        }
        return factorial;
    }
}

