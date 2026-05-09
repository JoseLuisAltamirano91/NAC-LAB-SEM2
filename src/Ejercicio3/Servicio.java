package Ejercicio3;

import Util.Utilitarios;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Servicio {

    public static void ingresarDatosEmpleadoCodigo(String[] codigo, String[] nombres, int nregistros){
        for (int i = 0; i < nregistros; i++) {
            Utilitarios.mostrarMensaje("\nIngrese los datos del empleado "+(i+1)+": ");
            codigo[i] = Utilitarios.capturarString("Código : ");
            nombres[i] = Utilitarios.capturarString("Nómbre : ");
        }
    }

    public static int buscarCodigoEmpleado(String[] arreglocodigo, String cempleado){
        for (int i = 0; i < arreglocodigo.length; i++) {
            if (Objects.equals(arreglocodigo[i] ,cempleado)) {
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
