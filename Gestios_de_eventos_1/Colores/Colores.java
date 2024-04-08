package Gestios_de_eventos_1.Colores;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Objects;

public class Colores extends JFrame {
    private final JComboBox<String> cajaColores;
    private final JPanel colorPanel;

    public Colores() {
        setLayout(new FlowLayout());

        // Array de colores disponibles para seleccionar
        String[] colors = {"Elige Color", "Rojo", "Verde", "Azul"};
        // Crear un JComboBox con la lista de colores
        cajaColores = new JComboBox<>(colors);
        // Panel para mostrar el color seleccionado
        colorPanel = new JPanel();
        // Establecer el tamaño preferido del panel de color
        colorPanel.setPreferredSize(new Dimension(100, 100));

        // Agregar el JComboBox al contenedor
        add(cajaColores);
        // Agregar el panel de color al contenedor
        add(colorPanel);

        // Registrar un ItemListener para detectar cambios en la selección del JComboBox
        cajaColores.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                // Obtener el color seleccionado del JComboBox y establecer el color de fondo del panel de color correspondientemente
                switch (Objects.requireNonNull(cajaColores.getSelectedItem()).toString()) {
                    case "Rojo":
                        colorPanel.setBackground(Color.RED);
                        break;
                    case "Verde":
                        colorPanel.setBackground(Color.GREEN);
                        break;
                    case "Azul":
                        colorPanel.setBackground(Color.BLUE);
                        break;
                    default:
                        // Establecer el color de fondo del panel de color a blanco si no se selecciona un color válido
                        colorPanel.setBackground(Color.WHITE);
                        break;
                }
            }
        });
        // Establecer la operación de cierre de la ventana al hacer clic en la "X" de cierre
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Establecer el tamaño de la ventana
        setSize(200, 200);
        // Hacer visible la ventana
        setVisible(true);
    }
}