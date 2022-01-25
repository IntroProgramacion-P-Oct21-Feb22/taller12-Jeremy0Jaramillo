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
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] datos = {100, 90, 80, 70, 60};
        double[] datos2 = {200, 190, 180, 170, 160};
        int i = 0;
        double[] valores = new double[5];

        double[] suma = obtenerSuma(valores, datos, datos2, i);
        for (int f = 0; f < suma.length; f++) {
            System.out.printf("%.2f\n", suma[f]);
        }
    }

    public static double[] obtenerSuma(double[] datos, double[] a, double[] b, int c) {
        if (c > 4) {
            return datos;
        } else {
            datos[c] = a[c] + b[c];
        }
        return obtenerSuma(datos, a, b, c + 1);
    }
}
