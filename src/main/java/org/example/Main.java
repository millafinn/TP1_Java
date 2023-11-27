package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("calculadora");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,  400);
        frame.setLocationRelativeTo(null);

        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new GridLayout(3, 2));

        JPanel panelMatrizA = new JPanel();
        panelMatrizA.setLayout(new GridLayout(3, 2));

        JPanel panelMatrizB = new JPanel();
        panelMatrizB.setLayout(new GridLayout(3, 2));

        JPanel panelMatrizC = new JPanel();
        panelMatrizC.setLayout(new GridLayout(3, 2));

        JPanel panelButtons = new JPanel();
        panelButtons.setLayout(new GridLayout(3, 3));

        JTextField inputMatrizA11 = new JTextField();
        JTextField inputMatrizA12 = new JTextField();
        JTextField inputMatrizA21 = new JTextField();
        JTextField inputMatrizA22 = new JTextField();

        JTextField inputMatrizB11 = new JTextField();
        JTextField inputMatrizB12 = new JTextField();
        JTextField inputMatrizB21 = new JTextField();
        JTextField inputMatrizB22 = new JTextField();
        JTextField inputEscalar= new JTextField();

        JTextField outputMatrizC11 = new JTextField();
        JTextField outputMatrizC12 = new JTextField();
        JTextField outputMatrizC21 = new JTextField();
        JTextField outputMatrizC22 = new JTextField();

        outputMatrizC11.setEditable(false);
        outputMatrizC12.setEditable(false);
        outputMatrizC21.setEditable(false);
        outputMatrizC22.setEditable(false);

        inputMatrizA11.setFont((new Font("Arial", Font.PLAIN, 30)));
        inputMatrizA12.setFont((new Font("Arial", Font.PLAIN, 30)));
        inputMatrizA21.setFont((new Font("Arial", Font.PLAIN, 30)));
        inputMatrizA22.setFont((new Font("Arial", Font.PLAIN, 30)));

        inputMatrizB11.setFont((new Font("Arial", Font.PLAIN, 30)));
        inputMatrizB12.setFont((new Font("Arial", Font.PLAIN, 30)));
        inputMatrizB21.setFont((new Font("Arial", Font.PLAIN, 30)));
        inputMatrizB22.setFont((new Font("Arial", Font.PLAIN, 30)));

        outputMatrizC11.setFont((new Font("Arial", Font.PLAIN, 30)));
        outputMatrizC12.setFont((new Font("Arial", Font.PLAIN, 30)));
        outputMatrizC21.setFont((new Font("Arial", Font.PLAIN, 30)));
        outputMatrizC22.setFont((new Font("Arial", Font.PLAIN, 30)));

        JLabel labelMatrizA = new JLabel("Matriz");
        labelMatrizA.setFont((new Font("Arial", Font.BOLD, 30)));
        JLabel labelTextoA = new JLabel("A");
        labelTextoA.setFont((new Font("Arial", Font.BOLD, 30)));
        JLabel labelMatrizB = new JLabel("Matriz");
        labelMatrizB.setFont((new Font("Arial", Font.BOLD, 30)));
        JLabel labelTextoB = new JLabel("B");
        labelTextoB.setFont((new Font("Arial", Font.BOLD, 30)));
        JLabel labelMatrizC = new JLabel("Matriz");
        labelMatrizC.setFont((new Font("Arial", Font.BOLD, 30)));
        JLabel labelTextoC = new JLabel("C");
        labelTextoC.setFont((new Font("Arial", Font.BOLD, 30)));
        JLabel labelTextoEscalar = new JLabel("Escalar");
        labelTextoEscalar.setFont((new Font("Arial", Font.BOLD, 30)));

        panelPrincipal.add(panelMatrizA);
        panelPrincipal.add(panelMatrizB);
        panelPrincipal.add(panelButtons);
        panelPrincipal.add(panelMatrizC);
        panelPrincipal.add(labelTextoEscalar);
        panelPrincipal.add(inputEscalar);

        panelMatrizA.add(labelMatrizA);
        panelMatrizA.add(labelTextoA);
        panelMatrizA.add(inputMatrizA11);
        panelMatrizA.add(inputMatrizA12);
        panelMatrizA.add(inputMatrizA21);
        panelMatrizA.add(inputMatrizA22);

        panelMatrizB.add(labelMatrizB);
        panelMatrizB.add(labelTextoB);
        panelMatrizB.add(inputMatrizB11);
        panelMatrizB.add(inputMatrizB12);
        panelMatrizB.add(inputMatrizB21);
        panelMatrizB.add(inputMatrizB22);

        panelMatrizC.add(labelMatrizC);
        panelMatrizC.add(labelTextoC);
        panelMatrizC.add(outputMatrizC11);
        panelMatrizC.add(outputMatrizC12);
        panelMatrizC.add(outputMatrizC21);
        panelMatrizC.add(outputMatrizC22);


        String[] buttonLabels = {"Somar", "Subtrair", "Multiplicar","Escalar"};

        for(String label: buttonLabels){
            JButton button = new JButton(label);
            button.setFont(new Font("Arial", Font.PLAIN, 30));
            panelButtons.add(button);


            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    double[][] matrizA = new double[2][2];
                    double[][] matrizB = new double[2][2];
                    double[][] matrizC = new double[2][2];
                    int escalar;

                    try{
                        matrizA[0][0] = Double.parseDouble(inputMatrizA11.getText());
                        matrizA[0][1] = Double.parseDouble(inputMatrizA12.getText());
                        matrizA[1][0] = Double.parseDouble(inputMatrizA21.getText());
                        matrizA[1][1] = Double.parseDouble(inputMatrizA22.getText());

                        matrizB[0][0] = Double.parseDouble(inputMatrizB11.getText());
                        matrizB[0][1] = Double.parseDouble(inputMatrizB12.getText());
                        matrizB[1][0] = Double.parseDouble(inputMatrizB21.getText());
                        matrizB[1][1] = Double.parseDouble(inputMatrizB22.getText());
                        escalar = Integer.parseInt(inputEscalar.getText());



                        if (label.equals("Somar")){
                           for(int linha = 0; linha < 2; linha++){
                               for(int coluna = 0; coluna < 2; coluna++) {
                                   matrizC[linha][coluna] =
                                           matrizA[linha][coluna] +
                                                   matrizB[linha][coluna];
                               }
                           }


                        }
                        else if (label.equals("Subtrair")){
                            for(int linha = 0;linha < 2; linha++){
                                for(int coluna = 0; coluna < 2; coluna++){
                                    matrizC[linha][coluna] =
                                            matrizA[linha][coluna] -
                                                    matrizB[linha][coluna];
                                }
                            }
                        }
                        else if (label.equals("Multiplicar")){
                            matrizC[0][0] = matrizA[0][0]*matrizB[0][0] +
                                    matrizA[0][1]*matrizB[1][0] ;

                            matrizC[0][1] = matrizA[0][0]*matrizB[0][1] +
                                    matrizA[0][1]*matrizB[1][1] ;

                            matrizC[1][0] = matrizA[1][0]*matrizB[0][0] +
                                    matrizA[1][1]*matrizB[1][0];

                            matrizC[1][1] = matrizA[1][0]*matrizB[0][1] +
                                    matrizA[1][1]*matrizB[1][1];
                        }

                        else if (label.equals("Escalar")){
                            for(int linha = 0; linha < 2; linha++){
                                for(int coluna = 0; coluna < 2; coluna++){
                                    matrizC[linha][coluna] =
                                            matrizA[linha][coluna] *
                                                    escalar;

                                }
                            }
                        }

                        outputMatrizC11.setText(Double.toString(matrizC[0][0]));
                        outputMatrizC12.setText(Double.toString(matrizC[0][1]));
                        outputMatrizC21.setText(Double.toString(matrizC[1][0]));
                        outputMatrizC22.setText(Double.toString(matrizC[1][1]));
                    }
                    catch (NumberFormatException ex){
                        outputMatrizC11.setFont((new Font("Arial", Font.PLAIN, 18)));
                        outputMatrizC12.setFont((new Font("Arial", Font.PLAIN, 18)));
                        outputMatrizC21.setFont((new Font("Arial", Font.PLAIN, 18)));
                        outputMatrizC22.setFont((new Font("Arial", Font.PLAIN, 18)));

                       outputMatrizC11.setText("Erro: Entrada inválida");
                       outputMatrizC12.setText("Erro: Entrada inválida");
                       outputMatrizC21.setText("Erro: Entrada inválida");
                       outputMatrizC22.setText("Erro: Entrada inválida");
                    }
                }
            });
        }
        frame.add(panelPrincipal);
        frame.setVisible(true);


    }
}