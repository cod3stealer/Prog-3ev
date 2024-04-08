package Gestios_de_eventos_1.Interfaz;

import javax.swing.*;
import java.awt.*;

public class Interfa {
    public static void main(String[] args) {
        /**
         * Clase principal que muestra un ejemplo de uso de JTextField para ingresar operandos,
         * JButton para realizar operaciones de suma y resta, y JOptionPane para mostrar los resultados.
         */
        JFrame frame = new JFrame("Ejemplo de JTextField");
        // Crear JTextField para el primer operando
        JTextField textFieldOP1 = new JTextField(20);
        // Crear JTextField para el segundo operando
        JTextField textFieldOP2 = new JTextField(20);
        // Hacer visible la ventana
        frame.setVisible(true);
        // Establecer el tamaño de la ventana
        frame.setSize(300, 200);
        // Centrar la ventana en la pantalla
        frame.setLocationRelativeTo(null);
        // Establecer la operación de cierre de la ventana al hacer clic en la "X" de cierre
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Crear JButton para la operación de suma
        JButton buttonSuma = new JButton("SUMA");
        // Crear JButton para la operación de resta
        JButton buttonResta = new JButton("RESTA");
        // Registrar ActionListener para la operación de suma
        buttonSuma.addActionListener(e -> {
            // Obtener el texto del JTextField y mostrarlo en una ventana emergente
            Float op1 = Float.parseFloat(textFieldOP1.getText());
            Float op2 = Float.parseFloat(textFieldOP2.getText());
            float resultado = op1 + op2;
            JOptionPane.showMessageDialog(frame, "Texto ingresado: " + Float.toString(resultado));
        });
        // Registrar ActionListener para la operación de resta
        buttonResta.addActionListener(e -> {
            // Obtener el texto del JTextField y mostrarlo en una ventana emergente
            Float op1 = Float.parseFloat(textFieldOP1.getText());
            Float op2 = Float.parseFloat(textFieldOP2.getText());
            float resultado = op1 - op2;
            JOptionPane.showMessageDialog(frame, "Texto ingresado: " + Float.toString(resultado));
        });
        // Obtener el contenedor principal de la ventana
        Container container = frame.getContentPane();
        // Establecer un diseño de flujo para el contenedor
        container.setLayout(new FlowLayout());
        // Agregar el JTextField del primer operando al contenedor
        container.add(textFieldOP1);
        // Agregar el JTextField del segundo operando al contenedor
        container.add(textFieldOP2);
        // Agregar el JButton de suma al contenedor
        container.add(buttonSuma);
        // Agregar el JButton de resta al contenedor
        container.add(buttonResta);
    }
}