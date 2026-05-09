package Ejercicio3;

import Util.Utilitarios;

import java.util.Random;
import java.util.Scanner;

public class Servicio {

    public static void ingresarDatosEmpleadoCodigo(int[] codigo, String[] nombres, int nregistros){
        for (int i = 0; i < nregistros; i++) {
            Utilitarios.mostrarMensaje("\nIngrese los datos del empleado "+(i+1)+": ");
            codigo[i] = Utilitarios.capturarEnteros("Código : ");
            nombres[i] = Utilitarios.capturarString("Nómbre : ");
        }
    }

    public static int buscarCodigoEmpleado(int[] arreglocodigo, int cempleado){
        for (int i = 0; i < arreglocodigo.length; i++) {
            if (arreglocodigo[i] == cempleado) {
                return i;
            }
        }
        return -1;
    }

    public static void ObtenerNombreEmpleado(String[] nombres,int posicion){
        String nombre = nombres[posicion];
        Utilitarios.mostrarMensaje("\nEl nombre del empleado es: " + nombre+"\n");
    }

}
