package Ejercicio4;

import Util.Utilitarios;

import java.util.Random;

public class Servicio {


    public static int[][] crearMatricesAleatorios(int filas, int columnas) {
        Random aleatorio = new Random();
        int[][] matriz = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = aleatorio.nextInt(10);
            }
        }
        return matriz;
    }

    public static void mostarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                Utilitarios.mostrarMensajeSinSaltoLinea(matriz[i][j] + " ");
            }
            Utilitarios.mostrarMensaje("");
        }
    }

    public static void mostrarMenu() {
        Utilitarios.mostrarMensaje("\nSeleccione operación: ");
        Utilitarios.mostrarMensaje("1. Sumar");
        Utilitarios.mostrarMensaje("2. Restar");
        Utilitarios.mostrarMensaje("3. Multiplicar");
        Utilitarios.mostrarMensaje("4. Transponer matriz A");
        Utilitarios.mostrarMensaje("5. Transponer matriz B");
    }

    public static int[][] sumaRestaMatriz(int[][] matrizA, int[][] matrizB, boolean sumar) {
        int filas = matrizA.length;
        int columnas = matrizA[0].length;
        int[][] matrizC = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (sumar) {
                    matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
                } else {
                    matrizC[i][j] = matrizA[i][j] - matrizB[i][j];
                }
            }
        }
        return matrizC;
    }

    public static int[][] multiplicarMatriz(int[][] matrizA, int[][] matrizB){
        if (matrizA[0].length != matrizB.length) {
            Utilitarios.mostrarMensaje("\nNo se puede multiplicar: columnas de A deben ser iguales a filas de B");
            return null;
        }
        int filas = matrizA.length;
        int columnas = matrizA[0].length;
        int filab = matrizB.length;

        int[][] matrizC = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                for(int k = 0; k < filab; k++) {
                    matrizC[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }
        return matrizC;
    }

    public static int[][] transponerMatriz(int[][] matrizA) {
        int filas = matrizA.length;
        int columnas = matrizA[0].length;

        int[][] matrizC = new int[columnas][filas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizC[j][i] = matrizA[i][j];
            }
        }
        return matrizC;
    }

}
