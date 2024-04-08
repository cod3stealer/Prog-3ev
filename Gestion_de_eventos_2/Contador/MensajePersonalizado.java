package Gestion_de_eventos_2;
/*
Enunciado 1: Temporizador con Mensaje Personalizado

Objetivo: Crear un programa que utilice un javax.swing.Timer para ejecutar
una tarea repetitiva cada cierto intervalo de tiempo. La tarea será mostrar
un mensaje personalizado en la consola. Este mensaje puede variar
dependiendo de una condición específica definida por el usuario.
Utilizaremos una clase anónima para definir la acción que realizará el
temporizador.

Requisitos:
Utilizar javax.swing.Timer para crear un temporizador que se ejecute cada 2
segundos.
Definir un mensaje predeterminado que se mostrará en cada tick del
temporizador.
Implementar una condición simple (por ejemplo, relacionada con el número
de veces que se ha mostrado el mensaje) para cambiar el mensaje después
de cierto número de iteraciones.
Utilizar una clase anónima para definir la acción del temporizador.
Asegurar que el programa maneje posibles excepciones adecuadamente.
* */
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class MensajePersonalizado {
    public static void main(String[] args) {
        Contador.iniciarContador();
    }
}