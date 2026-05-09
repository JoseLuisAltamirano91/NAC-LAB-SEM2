package Ejercicio10;

import Util.Utilitarios;

public class Servicio {

    public static void ingresarPedidos(double[][] matriz, String[] clientes, String[] platos){
        Utilitarios.mostrarMensaje("\nA) Registro de pedidos: ");
        for (int i = 0; i < matriz.length; i++) {
            clientes[i] = Utilitarios.capturarString("\nCliente: ");
            platos[i] = Utilitarios.capturarString("Platillo: ");
            matriz[i][0] = Utilitarios.capturarDouble("Cantidad: ");
            matriz[i][1] = Utilitarios.capturarDouble("Precio unitario: ");
        }
    }

    public static void calcularTotalDescuento(double[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            double total = matriz[i][0] * matriz[i][1];
            if (total > 50) {
                total = total - (total * 0.10);
            }
            matriz[i][2] = total;
        }
    }

    public static void mostrarReporte(double[][] matriz, String[] clientes, String[] platos) {
        Utilitarios.mostrarMensaje("\nB) Y C) Reporte de pedidos: ");
        Utilitarios.mostrarMensaje("cliente\tplato\tsubtotal\tdescuento\ttotal");
        for (int i = 0; i < matriz.length; i++) {
            double subtotal = matriz[i][0] * matriz[i][1];
            boolean aplicaDescuento = subtotal > 50;
            double descuento = aplicaDescuento ? subtotal * 0.10 : 0;
            Utilitarios.mostrarMensaje(clientes[i] + "\t" + platos[i] + "\t" + subtotal + "\t" + descuento + "\t" + matriz[i][2]);
        }
    }

    public static void calcularIngresoTotal(double[][] matriz){
        double total =0;
        for (int i = 0; i < matriz.length; i++) {
            total += matriz[i][2];
        }
        Utilitarios.mostrarMensaje("\nD) Ingreso total: " + total);
    }

    public static void mostrarMayorPedido(double[][] matriz, String[] clientes,String[] platos){
        int posicion = 0;
        double mayor = 0;

        for (int i = 0; i < matriz.length; i++) {
            if(matriz[i][2] > mayor){
                mayor = matriz[i][2];
                posicion = i;
            }
        }
        Utilitarios.mostrarMensaje("\nE) Mayor pedido: " + mayor);
        Utilitarios.mostrarMensaje("Cliente: " + clientes[posicion]);
        Utilitarios.mostrarMensaje("Platillo: " + platos[posicion]);
        Utilitarios.mostrarMensaje("Total: " + mayor);
    }
}
