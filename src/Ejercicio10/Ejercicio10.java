package Ejercicio10;

import Util.Utilitarios;

public class Ejercicio10 {
    public static void main(String[] args) {

        int m=3,n=0;
        double[][] pedidos;
        String clientes[];
        String platos[];

        n = Utilitarios.capturarEnteros("Ingrese el numero de pedidos: ");

        pedidos = new double[n][m];
        clientes = new String[n];
        platos = new String[n];

        Servicio.ingresarPedidos(pedidos, clientes, platos);
        Servicio.calcularTotalDescuento(pedidos);  //punto b y c
        Servicio.mostrarReporte(pedidos,clientes,platos);
        Servicio.calcularIngresoTotal(pedidos);
        Servicio.mostrarMayorPedido(pedidos,clientes,platos);








    }
}
