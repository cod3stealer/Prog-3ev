package Gestion_de_eventos_2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Contador {
    public static void iniciarContador(){
        Timer timer = new Timer(2000, new ActionListener() {
            int contador = 0;
            @Override
            public void actionPerformed(ActionEvent e) {
                contador ++;
                String mensaje = "llevamos "+contador+" ciclos de 2 segundos";
                if(contador > 5){
                    mensaje = "llevamos mas de 5 ciclos de 2 segundos";
                }
                System.out.println(mensaje);
            }
        });
        timer.start();
        JOptionPane.showMessageDialog(null, "Pulsa OK para salir");
        timer.stop();

    }
}