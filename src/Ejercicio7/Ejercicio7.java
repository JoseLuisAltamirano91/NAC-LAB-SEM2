package Ejercicio7;

import Util.Utilitarios;

public class Ejercicio7 {
    public static void main(String[] args) {

        int[] cestudiante;
        double[][] notas;
        double[] promedioCestudiante;

        int n = 0 ,m = 8;

        n= Utilitarios.capturarEnteros("Ingrese el numero de estudiantes: ");

       notas= new double[n][m];
       cestudiante= new int[m];

       Servicio.ingresaDatosMatriz(notas,cestudiante);
       promedioCestudiante = Servicio.calcularPromedioEstudiantes(notas,cestudiante);
       Servicio.calcularPromedioMaterias(notas);

       Servicio.mostrarEstudianteMejorPromedio(promedioCestudiante);
       Servicio.mostrarEstudiantesAprobadosPorMateria(notas);
       Servicio.mostrarEstudiantesReprobadosPorMateria(notas);

    }
}
