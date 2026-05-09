package Ejercicio4;

import Util.Utilitarios;

public class Ejercicio4 {
    public static void main(String[] args) {

        int m = 0, n = 0, opcion = 0;
        m = Utilitarios.capturarEnteros("Ingrese filas (M): ");
        n = Utilitarios.capturarEnteros("Ingrese columnas (N): ");

        int[][] matrizA = Servicio.crearMatricesAleatorios(n, m);
        int[][] matrizB = Servicio.crearMatricesAleatorios(n, m);
        int[][] resultado = null;

        Utilitarios.mostrarMensaje("\nMatriz A: ");
        Servicio.mostarMatriz(matrizA);

        Utilitarios.mostrarMensaje("\nMatriz B: ");
        Servicio.mostarMatriz(matrizB);

        Servicio.mostrarMenu();
        opcion = Utilitarios.capturarEnteros("\nIngrese opcion: ");

        switch (opcion) {
            case 1:
                resultado = Servicio.sumaRestaMatriz(matrizA, matrizB,true);
                break;
            case 2:
                resultado = Servicio.sumaRestaMatriz(matrizA, matrizB,false);
                break;
            case 3:
                resultado = Servicio.multiplicarMatriz(matrizA, matrizB);
                break;
            case 4:
                resultado = Servicio.transponerMatriz(matrizA);
                break;
            case 5:
                resultado = Servicio.transponerMatriz(matrizB);
                break;
            default:
                Utilitarios.mostrarMensaje("\nOpcion inválida");
        }

        if(resultado != null){
            Utilitarios.mostrarMensaje("\nResultado: ");
            Servicio.mostarMatriz(resultado);
        }
    }
}
