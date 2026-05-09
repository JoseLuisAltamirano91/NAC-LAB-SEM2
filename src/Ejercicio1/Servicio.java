package Ejercicio1;

import Util.Utilitarios;

import java.util.Objects;

public class Servicio {

    public static void ingresarDatosArreglo(String[] arreglo, String mensaje){
        Utilitarios.mostrarMensaje(mensaje);
        for(int i=0;i<arreglo.length;i++){
            arreglo[i] =Utilitarios.capturarString("Ingrese cédula del estudiante "+(i+1)+": ");
        }
        Utilitarios.mostrarMensaje("");
    }

    public static void imprimirArreglo(String[] arreglo, String mensaje){
        Utilitarios.mostrarMensaje(mensaje);
        for(int i=0;i<arreglo.length;i++){
            if(arreglo[i]!=null){
                Utilitarios.mostrarMensaje((i+1)+": "+arreglo[i]);
            }
        }
    }

    public static void verificarRegistrosIguales(String[] arreglo1,String[] arreglo2,String[] resultado){
        int contador = 0;

        for(int i = 0; i < arreglo1.length; i++){
            for(int j = 0; j < arreglo2.length; j++){
                if(Objects.equals(arreglo1[i], arreglo2[j])){
                    resultado[contador] = arreglo1[i];
                    contador++;
                    break;
                }
            }
        }
    }

}
