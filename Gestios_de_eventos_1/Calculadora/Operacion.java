package Gestios_de_eventos_1.Calculadora;
/**
 * @author Santiago Romero
 */
public class Operacion {
    public static final int SUMA = 0;
    public static final int RESTA = 1;
    public static final int MULTIPLICACION = 2;
    public static final int DIVISION = 3;
    public static final int RAIZ = 4;
    /**
     * @param num1 primer numero de la operacion
     * @param num2 segundo numero de la operacion
     * @param operacion
     * @return resultado
     */

    public static Float operar(Float num1, Float num2, int operacion){
        switch(operacion){
            case SUMA:
                return num1 + num2;
            case RESTA:
                return num1 - num2;
            case MULTIPLICACION:
                return num1 * num2;
            case DIVISION:
                return num1 / num2;
            case RAIZ:
                return (float) Math.pow(num1, num2);
            default:
                return null;
        }
    }
}