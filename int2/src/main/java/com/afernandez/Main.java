package com.afernandez;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main {
    public static void main(String[] args) {

        // Creamos el JFrame
        JFrame jFrame = new JFrame("AWT calc");
        // Lo de siempre, que se cierre al terminar
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(400, 150);

        // Creamos un JPanel para organizar el temita
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new FlowLayout());

        // Creamos las etiquetas de texto
        JLabel jLabel1 = new JLabel("Num 1:");
        JLabel jLabel2 = new JLabel("Num 2:");
        JLabel jLabel3 = new JLabel("Equals:");

        // Creamos los campos de texto
        JTextField jText1 = new JTextField(10);
        JTextField jText2 = new JTextField(10);
        JTextField jText3 = new JTextField(10);

        // Que no toquen el resultado
        jText3.setEditable(false);

        // Creamos los botones
        JButton jButton1 = new JButton("+");
        JButton jButton2 = new JButton("Clear");
        JButton jButton3 = new JButton("-");
        JButton jButton4 = new JButton("x");
        JButton jButton5 = new JButton("/");

        jButton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num1Text = jText1.getText();
                String num2Text = jText2.getText();
                // Chequeamos que tienen su valor y tal
                if (!num1Text.isEmpty() && !num2Text.isEmpty()) {
                    try {
                        // Pasamos la mandanga de string a int
                        int num1 = Integer.parseInt(num1Text);
                        int num2 = Integer.parseInt(num2Text);

                        // Realizamos la suma
                        int resultado = num1 / num2;

                        // Printamos el resultado y tal
                        jText3.setText(Integer.toString(resultado));
                    } catch (NumberFormatException ex) {
                        // Si hay un error al convertir los números, lo soltamos
                        jText3.setText("Error");
                    }
                } else {
                    // Si algún campo está vacío, mostramos un mensaje
                    jText3.setText("PON NUMEROS");
                }
            }
        });

        jButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Recogemos los números de los campos de texto en variables
                String num1Text = jText1.getText();
                String num2Text = jText2.getText();

                // Chequeamos que tienen su valor y tal
                if (!num1Text.isEmpty() && !num2Text.isEmpty()) {
                    try {
                        // Pasamos la mandanga de string a int
                        int num1 = Integer.parseInt(num1Text);
                        int num2 = Integer.parseInt(num2Text);

                        // Realizamos la suma
                        int resultado = num1 * num2;

                        // Printamos el resultado y tal
                        jText3.setText(Integer.toString(resultado));
                    } catch (NumberFormatException ex) {
                        // Si hay un error al convertir los números, lo soltamos
                        jText3.setText("Error");
                    }
                } else {
                    // Si algún campo está vacío, mostramos un mensaje
                    jText3.setText("PON NUMEROS");
                }
            }
        });

        jButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Recogemos los números de los campos de texto en variables
                String num1Text = jText1.getText();
                String num2Text = jText2.getText();

                // Chequeamos que tienen su valor y tal
                if (!num1Text.isEmpty() && !num2Text.isEmpty()) {
                    try {
                        // Pasamos la mandanga de string a int
                        int num1 = Integer.parseInt(num1Text);
                        int num2 = Integer.parseInt(num2Text);

                        // Realizamos la suma
                        int resultado = num1 - num2;

                        // Printamos el resultado y tal
                        jText3.setText(Integer.toString(resultado));
                    } catch (NumberFormatException ex) {
                        // Si hay un error al convertir los números, lo soltamos
                        jText3.setText("Error");
                    }
                } else {
                    // Si algún campo está vacío, mostramos un mensaje
                    jText3.setText("PON NUMEROS");
                }
            }
        });

        // Añadimos un ActionListener al botón de suma
        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Recogemos los números de los campos de texto en variables
                String num1Text = jText1.getText();
                String num2Text = jText2.getText();

                // Chequeamos que tienen su valor y tal
                if (!num1Text.isEmpty() && !num2Text.isEmpty()) {
                    try {
                        // Pasamos la mandanga de string a int
                        int num1 = Integer.parseInt(num1Text);
                        int num2 = Integer.parseInt(num2Text);

                        // Realizamos la suma
                        int resultado = num1 + num2;

                        // Printamos el resultado y tal
                        jText3.setText(Integer.toString(resultado));
                    } catch (NumberFormatException ex) {
                        // Si hay un error al convertir los números, lo soltamos
                        jText3.setText("Error");
                    }
                } else {
                    // Si algún campo está vacío, mostramos un mensaje
                    jText3.setText("PON NUMEROS");
                }
            }
        });

        // Añadimos un ActionListener al botón de limpiar
        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Limpiamos toda la mandanga
                jText1.setText("");
                jText2.setText("");
                jText3.setText("");
            }
        });

        // Añadimos el temita
        jPanel.add(jLabel1);
        jPanel.add(jText1);
        jPanel.add(jLabel2);
        jPanel.add(jText2);
        jPanel.add(jLabel3);
        jPanel.add(jText3);
        jPanel.add(jButton1);
        jPanel.add(jButton2);
        jPanel.add(jButton3);
        jPanel.add(jButton4);
        jPanel.add(jButton5);


        // Añadimos el panel al JFrame
        jFrame.add(jPanel);

        // Hacemos visible la mandanga
        jFrame.setVisible(true);
    }
}