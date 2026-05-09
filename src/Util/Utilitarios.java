package Util;

import java.util.Scanner;

public class Utilitarios {
    static Scanner sc = new Scanner(System.in);

    public static void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }

    public static void mostrarMensajeSinSaltoLinea(String mensaje){
        System.out.print(mensaje);
    }

    public static int capturarEnteros(String mensaje){
       // mostrarMensaje(mensaje);
        mostrarMensajeSinSaltoLinea(mensaje);
        return sc.nextInt();
    }

    public static Double capturarDouble(String mensaje){
       // mostrarMensaje(mensaje);
        mostrarMensajeSinSaltoLinea(mensaje);
        return sc.nextDouble();
    }

    public static String capturarString(String mensaje){
       // mostrarMensaje(mensaje);
        mostrarMensajeSinSaltoLinea(mensaje);
        return sc.next();
    }

}
