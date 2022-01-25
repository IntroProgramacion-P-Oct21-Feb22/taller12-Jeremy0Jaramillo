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
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] datos = {100, 90, 80, 70, 60};
        double[] potencias = {2, 3, 2, 2, 1};
        int i = 0;
        double[] valores = new double[5];
        double suma;
        double operacion = 0;

        double[] resultado = obtenerPotencia(valores, datos, potencias, i);
        for (int f = 0; f < resultado.length; f++) {
            System.out.printf("%.0f\n", resultado[f]);
        }
        suma = obtenerSuma(operacion, resultado, i);
        System.out.printf("El resultado de la suma de los valores es: %.1f\n", suma);
    }

    public static double[] obtenerPotencia(double[] datos, double[] a, double[] b, int c) {
        if (c > 4) {
            return datos;
        } else {
            datos[c] = Math.pow(a[c], b[c]);
        }
        return obtenerPotencia(datos, a, b, c + 1);
    }

    public static double obtenerSuma(double suma, double[] datos, int a) {
        if (a > 4) {
            return suma;
        }
        suma = suma + datos[a];
        return obtenerSuma(suma, datos, a + 1);
    }
}
