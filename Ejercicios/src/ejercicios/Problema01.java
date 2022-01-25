/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/**
 *
 * @author reroes
 */
public class Problema01 {

    public static void main(String[] args) {
        double[][] datos = {{10, 2}, {1, 5}, {6, 2}, {7, 8}};

        double[][] resultado = new double[4][2];

        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                resultado[i][j] = factorial(datos[i][j]);
                System.out.printf("factorial de %.0f = %.2f\n", datos[i][j], resultado[i][j]);
            }
        }

    }

    public static double factorial(double numero) {

        if (numero <= 1) {
            return 1;
        } else {

            return numero * factorial(numero - 1);
        }
    }
}
