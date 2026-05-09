package Ejercicio5;

import Util.Utilitarios;

import java.util.Random;

public class Servicio {

    public static void ingresarPrecios(double[][] matriz) {
        Utilitarios.mostrarMensaje("\nINGRESO DE PRECIOS");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = Utilitarios.capturarDouble("Precio del articulo "
                        + (i + 1)
                        + " en sucursal "
                        + (j + 1)
                        + ": ");
            }
        }
    }

    public static void ingresarCantidad(int[][] matriz) {
        Utilitarios.mostrarMensaje("\nINGRESO DE CANTIDADES VENDIDAS");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = Utilitarios.capturarEnteros("Cantidad vendida del articulo "
                        + (i + 1)
                        + " en sucursal "
                        + (j + 1)
                        + ": ");
            }
        }
    }

    public static void mostrarVentasMatriz(int[][] cantidad,double[][]precio) {
        Utilitarios.mostrarMensaje("\nTOTAL DE VENTAS POR ARTICULO");

        for (int i = 0; i < cantidad.length; i++) {
            double totalarticulo =0;
            for (int j = 0; j < cantidad[i].length; j++) {
                totalarticulo += cantidad[i][j] * precio[i][j];
            }
            Utilitarios.mostrarMensaje("Articulo "
                    + (i + 1)
                    + ": $"
                    + totalarticulo);
        }
    }


    public static void mostrarVentasSucMatriz(int[][] cantidad, double[][] precio) {
        Utilitarios.mostrarMensaje("\nTOTAL DE VENTAS POR SUCURSAL");


        for (int i = 0; i < cantidad[0].length; i++) {
            double totalasucursal = 0;
            for (int j = 0; j < cantidad.length; j++) {
                totalasucursal += cantidad[j][i] * precio[j][i];
            }

            Utilitarios.mostrarMensaje("Sucursal "
                    + (i + 1)
                    + ": $"
                    + totalasucursal);
        }
    }

}
