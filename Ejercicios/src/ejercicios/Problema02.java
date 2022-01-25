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
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[][] datos1 = {{10, 2, 3}, {1, 5, 8}, {6, 2, 3}, {7, 8, 1}};
        double[][] datos2 = {{10, 2, 3}, {1, 5, 8}, {6, 2, 3}, {7, 8, 1}};
        int i = 0;
        double[][] datos = new double[4][3];

        double[][] datos3 = obtenerSuma(datos, datos1, datos2, i);
        for (int f = 0; f < datos3.length; f++) {
            for (int c = 0; c < datos3[f].length; c++) {
                System.out.printf("%.2f\n", datos3[f][c]);
            }
        }
    }

    public static double[][] obtenerSuma(double[][] datos, double[][] a, double[][] b, int c) {
        int d;

        if (c > 3) {
            return datos;
        } else {
            for (d = 0; d < 3; d++) {

                datos[c][d] = a[c][d] + b[c][d];
            }
        }
        return obtenerSuma(datos, a, b, c + 1);
    }

}
