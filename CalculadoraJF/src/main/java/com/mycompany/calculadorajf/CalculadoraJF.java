import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculadoraJF implements ActionListener {
    // Componentes de la interfaz
    private final JFrame ventana;
    private final JTextField display;
    private final JButton[] botones;
    
    // Variables para las operaciones
    private double numero1, numero2, resultado;
    private char operacion;
    private boolean nuevoNumero = true;

    public CalculadoraJF() {
        // Crear la ventana principal
        ventana = new JFrame("Calculadora Simple");
        ventana.setLayout(new BorderLayout());
        ventana.setSize(250, 300);
        
        // Crear el campo de texto para mostrar números
        display = new JTextField("0", 15);
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setEditable(false);
        
        // Panel para el display
        JPanel panelDisplay = new JPanel();
        panelDisplay.add(display);
        
        // Crear botones
        String[] etiquetas = {"7", "8", "9", "+",
                             "4", "5", "6", "-",
                             "1", "2", "3", "=",
                             "0", "C"};
        botones = new JButton[etiquetas.length];
        
        // Panel para los botones
        JPanel panelBotones = new JPanel(new GridLayout(4, 4, 2, 2));
        
        // Crear y agregar los botones
        for (int i = 0; i < etiquetas.length; i++) {
            botones[i] = new JButton(etiquetas[i]);
            botones[i].addActionListener(this);
            panelBotones.add(botones[i]);
        }
        
        // Agregar componentes a la ventana
        ventana.add(panelDisplay, BorderLayout.NORTH);
        ventana.add(panelBotones, BorderLayout.CENTER);
        
        // Configurar la ventana
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();
        
        // Manejar números
        if (Character.isDigit(comando.charAt(0))) {
            if (nuevoNumero) {
                display.setText(comando);
                nuevoNumero = false;
            } else {
                display.setText(display.getText() + comando);
            }
        }
        
        // Manejar operaciones
        if (comando.equals("+") || comando.equals("-")) {
            numero1 = Double.parseDouble(display.getText());
            operacion = comando.charAt(0);
            nuevoNumero = true;
        }
        
        // Manejar igual
        if (comando.equals("=")) {
            numero2 = Double.parseDouble(display.getText());
            calcular();
            nuevoNumero = true;
        }
        
        // Manejar limpiar
        if (comando.equals("C")) {
            display.setText("0");
            numero1 = numero2 = 0;
            nuevoNumero = true;
        }
    }

    private void calcular() {
        switch (operacion) {
            case '+' -> resultado = numero1 + numero2;
            case '-' -> resultado = numero1 - numero2;
        }
        display.setText(String.valueOf(resultado));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CalculadoraJF());
    }
}
