package Ejercicio3;

import Util.Utilitarios;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        int n = Utilitarios.capturarEnteros( "Ingresar el número de registros: ");
        String[] nombres = new String[n];
        int[] codigos = new int[n];
        int pos = 0, cempleado =0;

        //INGRESAR DATOS
        Servicio.ingresarDatosEmpleadoCodigo(codigos, nombres, n);

        //BUSCAR EMPLEADO
        cempleado = Utilitarios.capturarEnteros("\nIngrese el codigo de empleado a buscar: ");
        pos = Servicio.buscarCodigoEmpleado(codigos,cempleado);
        if(pos != -1) {
            Servicio.ObtenerNombreEmpleado(nombres,pos);
        }else{
            Utilitarios.mostrarMensaje("\nNo se encontro al empleado con el código: " +cempleado);
        }
    }
}
