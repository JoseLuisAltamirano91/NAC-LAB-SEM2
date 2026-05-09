package Ejercicio2;

import Util.Utilitarios;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Servicio {

    public static void llenarArregloAleatorio(int[] arreglo){
        Random rand = new Random();
        for(int i = 0; i < arreglo.length; i++){
            arreglo[i] = rand.nextInt(50);
        }
    }

    public static void imprimirArreglo(int[] arreglo, String mensaje){
        Utilitarios.mostrarMensaje(mensaje);
        for(int i=0;i<arreglo.length;i++){
            Utilitarios.mostrarMensaje((i+1)+".- "+arreglo[i] + "");
        }
        Utilitarios.mostrarMensaje("");
    }


    public static void  buscarNumeroArreglo(int [] arreglo, int numero){
        int pos = -1;

        for(int i=0;i<arreglo.length;i++){
            if(arreglo[i]==numero){
                pos = (i+1);
                break;
            }
        }
        if(pos < 0){
            Utilitarios.mostrarMensaje("No se encontró el número: "+numero);
        }else{
            Utilitarios.mostrarMensaje("Número encontrado en la posición: " + pos);
        }
    }


    public static void crearArregloIndiceImpar(int [] arregloOriginal, int[] arregloImpar){
        int contador = 0;
        for(int i=0;i<arregloOriginal.length;i+=2){
            arregloImpar[contador]=arregloOriginal[i];
            contador++;
        }
    }

    public static void contarElementosMayoresA20(int [] arreglo){
        int contador = 0;
        for(int i=0;i<arreglo.length;i++){
            if(arreglo[i]>20){
                contador++;
            }
        }
        Utilitarios.mostrarMensaje("C) Cantidad mayores a 20: "+ contador);
    }

}
