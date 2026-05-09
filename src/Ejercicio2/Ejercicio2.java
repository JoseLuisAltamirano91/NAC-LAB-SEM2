package Ejercicio2;

import Util.Utilitarios;

public class Ejercicio2 {
    public static void main(String[] args) {

        int[] aleatorio = new int[20];
        int[] arregloImpares = new int[10];

        //LLENAR EL ARREGLO
        Servicio.llenarArregloAleatorio(aleatorio);

        //IMPRIMIR ARREGLO
        Servicio.imprimirArreglo(aleatorio,"\nArreglo aleatorio");

        //BUSCAR NUMERO
        int num = Utilitarios.capturarEnteros("Ingrese el número a buscar: ");
        Servicio.buscarNumeroArreglo(aleatorio, num);

        //CREAR SEGUNDO VECTOR CON ELEMENTOS DE INDICE IMPAR
        Servicio.crearArregloIndiceImpar(aleatorio, arregloImpares);

        //IMPRIME EL NUEVO ARREGLO
        Servicio.imprimirArreglo(arregloImpares,"\nArreglo indices impares");

        //CONTAR NUMEROS MAYORES A 20
        Servicio.contarElementosMayoresA20(arregloImpares);
        Utilitarios.mostrarMensaje("\n");
    }
}
