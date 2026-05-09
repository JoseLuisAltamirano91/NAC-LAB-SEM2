package Ejercicio6;

import Util.Utilitarios;

public class Servicio {

    public static void ingresarDatosMatriz(double[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            Utilitarios.mostrarMensaje("\nVENDEDOR " + (i + 1));
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = Utilitarios.capturarDouble("Ventas del año " + (j + 1) + ": ");
            }
        }
    }

    public static void mostrarDatosMatriz(double[][] matriz){
        Utilitarios.mostrarMensaje("\nMATRIZ DE VENTAS");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                Utilitarios.mostrarMensajeSinSaltoLinea(matriz[i][j] + "\t");
            }
            Utilitarios.mostrarMensaje("");
        }
    }

    public static void calcularVentasVendedores(double[][] matriz){
        Utilitarios.mostrarMensaje("\nTOTAL DE VENTAS POR VENDEDOR");
        for (int i = 0; i < matriz.length; i++) {
            double total = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                total += matriz[i][j];
            }
            Utilitarios.mostrarMensaje("Vendedor " + (i + 1) + ": " + total);
        }
    }

    public  static void calcularVentasAnio(double[][] matriz){
        Utilitarios.mostrarMensaje("\nTOTAL DE VENTAS POR AÑO");
        for (int i = 0; i < matriz[0].length; i++) {
            double total = 0;
            for (int j = 0; j < matriz.length; j++) {
                total += matriz[j][i];
            }
            Utilitarios.mostrarMensaje("Año " + (i + 1) + ": " + total);
        }
    }

    public static void calcularVentasTotal(double[][] matriz){
        double total = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                total += matriz[i][j];
            }
        }
        Utilitarios.mostrarMensaje("\nTOTAL GENERAL DE LA EMPRESA: " + total);
    }

}
