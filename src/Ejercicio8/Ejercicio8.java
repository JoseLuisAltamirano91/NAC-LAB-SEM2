package Ejercicio8;

import Util.Utilitarios;

public class Ejercicio8 {
    public static void main(String[] args) {

        int n=0;
        int m = 5;
        int datos[][];

        n = Utilitarios.capturarEnteros("Ingrese el numero de operarios: ");

        datos = new int[n][m];
        Servicio.ingresarDatos(datos);
        Servicio.calcularGrado(datos);
        Servicio.mostrarResultado(datos);
    }
}
