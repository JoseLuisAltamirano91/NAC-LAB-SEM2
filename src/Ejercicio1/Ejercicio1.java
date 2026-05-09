package Ejercicio1;

import Util.Utilitarios;

public class Ejercicio1 {
    public static void main(String[] args) {
        int n = Utilitarios.capturarEnteros("Ingrese el número de registros a ingresar:");

        String[] matematicas = new String[n];
        String[] ingles = new String[n];
        String[] ambos = new String[n];

        //LLENAR ARREGLO MATEMATICAS
        Servicio.ingresarDatosArreglo(matematicas,"Asignatura matemáticas");

        //LLENAR ARREGLO DE INGLES
        Servicio.ingresarDatosArreglo(ingles,"Asignatura ingles");

        ///Verificar coincidencias
        Servicio.verificarRegistrosIguales(matematicas,ingles,ambos);

        //IMPRIME RESULTADOS
        Servicio.imprimirArreglo(matematicas,"\nLista de estudiante que reprobaron la asignatura matemáticas:");
        Servicio.imprimirArreglo(ingles,"\nLista de estudiante que reprobaron la asignatura ingles:");
        Servicio.imprimirArreglo(ambos,"\nLista de estudiante que reprobaron ambas asignaturas:");

        Utilitarios.mostrarMensaje("");
    }


}