package Ejercicio5;

import Util.Utilitarios;

public class Ejercicio5 {
    public static void main(String[] args) {

        int narticulos=0;
        int nsucursales=0;

        narticulos = Utilitarios.capturarEnteros("Ingrese el número de articulos: ");
        nsucursales = Utilitarios.capturarEnteros("Ingrese el numero de sucursales: ");

        double[][] precios= new double[narticulos][nsucursales];
        int [][] cantidades = new int[narticulos][nsucursales];

        Servicio.ingresarPrecios(precios);
        Servicio.ingresarCantidad(cantidades);

        Servicio.mostrarVentasMatriz(cantidades,precios);
        Servicio.mostrarVentasSucMatriz(cantidades,precios);

    }
}
