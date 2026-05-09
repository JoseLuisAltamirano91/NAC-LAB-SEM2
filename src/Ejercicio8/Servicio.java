package Ejercicio8;

import Util.Utilitarios;
import jdk.jshell.execution.Util;

public class Servicio {

    public static void ingresarDatos(int[][] matriz) {
        Utilitarios.mostrarMensaje("\nRegistro de datos: ");
        for (int i = 0; i < matriz.length; i++) {
            Utilitarios.mostrarMensaje("\nOperario: " + (i + 1));
            matriz[i][0] = Utilitarios.capturarEnteros("Codigo: ");
            matriz[i][1] = Utilitarios.capturarEnteros("Horas de ausencia: ");
            matriz[i][2] = Utilitarios.capturarEnteros("Pupitres defectuosos: ");
            matriz[i][3] = Utilitarios.capturarEnteros("Pupitres producidos: ");
        }
    }

    public static void calcularGrado(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            boolean c1 = matriz[i][1] <= 3;
            boolean c2 = matriz[i][2] < 300;
            boolean c3 = matriz[i][3] > 10000;

            int grado = 0;


            if (!c1 && !c2 && !c3) {
                grado = 5;
            } else if (c1 && !c2 && !c3) {
                grado = 7;
            } else if (!c1 && c2 && !c3) {
                grado = 8;
            } else if (!c1 && !c2 && c3) {
                grado = 9;
            } else if (c1 && c2 && !c3) {
                grado = 12;
            } else if (c1 && !c2 && c3) {
                grado = 13;
            } else if (!c1 && c2 && c3) {
                grado = 15;
            } else {
                grado = 20;
            }

            matriz[i][4] = grado;
        }
    }

    public static void mostrarResultado(int[][] matriz) {
        Utilitarios.mostrarMensaje("\nResultado: ");
        Utilitarios.mostrarMensaje("CODIGO\tHORAS\tDEFECTUOSOS\tPRODUCIDOS\tGRADO");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                Utilitarios.mostrarMensajeSinSaltoLinea(matriz[i][j]+"\t");
            }
            Utilitarios.mostrarMensaje("");
        }
    }
}
