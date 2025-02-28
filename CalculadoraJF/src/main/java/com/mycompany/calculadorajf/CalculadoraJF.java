
package com.mycompany.calculadorajf;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculadoraJF extends JFrame {
    
    private JTextField txtNumero1;
    private JTextField txtNumero2;
    private JTextField txtResultado;
    private final JButton btnSumar;
    private final JButton btnRestar;

    public CalculadoraJF() {
        
        setTitle("Calculadora Simple");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2, 10, 10));
        
        
        txtNumero1 = new JTextField();
        txtNumero2 = new JTextField();
        txtResultado = new JTextField();
        txtResultado.setEditable(false);
        
        btnSumar = new JButton("+");
        btnRestar = new JButton("-");
        
        add(new JLabel("Número 1:"));
        add(txtNumero1);
        add(new JLabel("Número 2:"));
        add(txtNumero2);
        add(new JLabel("Resultado:"));
        add(txtResultado);
        add(btnSumar);
        add(btnRestar);
        
        
        btnSumar.addActionListener((ActionEvent e) -> {
            try {
                double num1 = Double.parseDouble(txtNumero1.getText());
                double num2 = Double.parseDouble(txtNumero2.getText());
                txtResultado.setText(String.valueOf(num1 + num2));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, 
                        "Por favor ingrese números válidos",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        });
        
        btnRestar.addActionListener((ActionEvent e) -> {
            try {
                double num1 = Double.parseDouble(txtNumero1.getText());
                double num2 = Double.parseDouble(txtNumero2.getText());
                txtResultado.setText(String.valueOf(num1 - num2));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, 
                        "Por favor ingrese números válidos",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        });
        
        
        setLocationRelativeTo(null);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new CalculadoraJF().setVisible(true);
        });
    }
}