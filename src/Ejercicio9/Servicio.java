package Ejercicio9;

import Util.Utilitarios;

import javax.swing.plaf.multi.MultiToolTipUI;

public class Servicio {

    public static void registroMedicamentos(double[][] matriz,String[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            Utilitarios.mostrarMensaje("\nMedicamento "+(i+1));
            arreglo[i] = Utilitarios.capturarString("Nombre: ");

            matriz[i][0] = Utilitarios.capturarDouble("Stock actual: ");
            matriz[i][1] = Utilitarios.capturarDouble("Stock minimo: ");
            matriz[i][2] = Utilitarios.capturarDouble("Precio unitario: ");
        }
    }

    public static void mostrarMedicamentosStockMin(double[][] matriz,String[] arreglo){
        Utilitarios.mostrarMensaje("\nMedicamentos con stock bajo");
        for (int i = 0; i < arreglo.length; i++) {
            if(matriz[i][0] < matriz[i][1]){
                Utilitarios.mostrarMensaje("Nombre: "+arreglo[i] + " - "+matriz[i][0]);
            }
        }
    }

    public static void calcularTotalInventario(double[][] matriz,String[] arreglo){
        double totalInventario = 0;
        for (int i = 0; i < arreglo.length; i++) {
            totalInventario += matriz[i][0] * matriz[i][2];
        }
        Utilitarios.mostrarMensaje("\nValor total inventario: "+totalInventario);
    }

    public static void actualizarStock(double[][] matriz,String[] arreglo){
        int posicion = 0;
        double venta = 0;
        Utilitarios.mostrarMensaje("\nVenta de medicamentos: ");
        mostrarProductos(arreglo);
        posicion = Utilitarios.capturarEnteros("Ingrese el numero de producto:") -1;
        venta = Utilitarios.capturarDouble("Ingrese la cantidad vendida: ");

        matriz[posicion][0] -= venta;
        Utilitarios.mostrarMensaje("\nEl stock actualizado: "+ matriz[posicion][0]);
    }

    public static void mostrarProductos(String[] arreglo){
        Utilitarios.mostrarMensaje("\nSeleccione un producto: ");
        for (int i = 0; i < arreglo.length; i++) {
            Utilitarios.mostrarMensaje((i+1)+": "+arreglo[i]);
        }
    }

    public static void mostrarReporte(double[][] matriz, String[] arreglo) {
        Utilitarios.mostrarMensaje("\nReporte de medicamentos: ");
        Utilitarios.mostrarMensaje("NOMBRE\tSTOCK\tMINIMO\tPRECIO\tVALOR");
        for (int i = 0; i < arreglo.length; i++) {
            double valor = matriz[i][0] * matriz[i][2];
            Utilitarios.mostrarMensajeSinSaltoLinea(arreglo[i] + "\t");

            for (int j = 0; j < matriz[i].length; j++) {
                Utilitarios.mostrarMensajeSinSaltoLinea(matriz[i][j] + "\t");
            }

            Utilitarios.mostrarMensaje(valor + "");
        }
    }
}
