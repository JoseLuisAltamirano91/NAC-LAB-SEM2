package Ejercicio6;

import Util.Utilitarios;

public class Ejercicio6 {
    public static void main(String[] args) {

        int n = 0 ,m = 0;

        n= Utilitarios.capturarEnteros("Ingrese numero de vendedores: ");
        m= Utilitarios.capturarEnteros("Ingrese numero de años: ");

        double[][] ventas = new double[n][m];
        Servicio.ingresarDatosMatriz(ventas);
        Servicio.mostrarDatosMatriz(ventas);
        Servicio.calcularVentasVendedores(ventas);

        Servicio.calcularVentasAnio(ventas);

        Servicio.calcularVentasTotal(ventas);

    }
}
