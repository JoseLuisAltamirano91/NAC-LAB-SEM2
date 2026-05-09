package Ejercicio7;

import Util.Utilitarios;
import jdk.jshell.execution.Util;

public class Servicio {


    public static void ingresaDatosMatriz(double[][] notas, int[] cestudiantes) {
        Utilitarios.mostrarMensaje("\nRegistro de notas");
        for (int i = 0; i < notas.length; i++) {
            Utilitarios.mostrarMensaje("\nEstudiante: " + (i + 1));
            cestudiantes[i] = Utilitarios.capturarEnteros("Codigo:");
            for (int j = 0; j < notas[i].length; j++) {
                double nota = Utilitarios.capturarDouble("Nota materia " + (j + 1) + ": ");
                if (nota > 10) {
                    Utilitarios.mostrarMensaje("Valor ingresado no valido:" + nota);
                    j--;
                } else {
                    notas[i][j] = nota;
                }
            }
        }
    }

    public static double[] calcularPromedioEstudiantes(double[][] notas, int[] cestudiantes) {
        double mayorpromedio =0;
        int cestudiantemayorpromedio =0;
        Utilitarios.mostrarMensaje("\nPromedio por estudiante:");
        for (int i = 0; i < notas.length; i++) {
            double suma = 0;
            for (int j = 0; j < notas[i].length; j++) {
                suma += notas[i][j];
            }
            double promedio = suma / notas[i].length;
            Utilitarios.mostrarMensaje("Estudiante " + cestudiantes[i] + " promedio: " + promedio);

            if(promedio > mayorpromedio) {
                mayorpromedio = promedio;
                cestudiantemayorpromedio = cestudiantes[i];
            }

        }
        return new double[]{mayorpromedio, (double) cestudiantemayorpromedio};
    }

    static void calcularPromedioMaterias(double[][] notas) {
        Utilitarios.mostrarMensaje("\nPromedio por materia:");
        for (int i = 0; i < notas[0].length; i++) {
            double suma = 0;
            for (int j = 0; j < notas.length; j++) {
                suma += notas[j][i];
            }

            double promedio = suma / notas.length;
            Utilitarios.mostrarMensaje("Materia " + (i + 1) + " promedio: " + promedio);
        }
    }

    public static void mostrarEstudianteMejorPromedio(double[] promedioestudiante) {
        Utilitarios.mostrarMensaje("\nEstudiante con mayor promedio:");
        Utilitarios.mostrarMensaje("Estudiante: "+ ((int) promedioestudiante[1]));
        Utilitarios.mostrarMensaje("Promedio: "+ (promedioestudiante[0]));
    }

    public static void mostrarEstudiantesAprobadosPorMateria(double[][] notas) {
        Utilitarios.mostrarMensaje("\nNumero de estudiantes aprobados por materia:");
        for (int i = 0; i < notas[0].length; i++) {
            int aprobados = 0;
            for (int j = 0; j < notas.length; j++) {
                if(notas[j][i] >= 7 && notas[j][i] <= 10) {
                    aprobados++;
                }
            }
            Utilitarios.mostrarMensaje("Materia " + (i + 1) + ": " + aprobados);
        }
    }

    public static void mostrarEstudiantesReprobadosPorMateria(double[][] notas) {
        Utilitarios.mostrarMensaje("\nNumero de estudiantes reprobados por materia:");
        for (int i = 0; i < notas[0].length; i++) {
            int reprobados = 0;
            for (int j = 0; j < notas.length; j++) {
                if(notas[j][i] < 7) {
                    reprobados++;
                }
            }
            Utilitarios.mostrarMensaje("Materia " + (i + 1) + ": " + reprobados);
        }
    }

}
