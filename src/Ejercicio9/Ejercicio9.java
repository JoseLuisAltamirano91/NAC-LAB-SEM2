package Ejercicio9;

import Util.Utilitarios;

public class Ejercicio9 {
    public static void main(String[] args) {

        double medicamentos[][] ;
        String nombres[];
        int m=3;
        int n=0;

        n= Utilitarios.capturarEnteros("Ingrese el numero de medicamentos:");

        medicamentos= new double[n][m];
        nombres= new  String[n];

        Servicio.registroMedicamentos(medicamentos,nombres);
        Servicio.mostrarMedicamentosStockMin(medicamentos,nombres);
        Servicio.calcularTotalInventario(medicamentos,nombres);
        Servicio.actualizarStock(medicamentos,nombres);
        Servicio.mostrarReporte(medicamentos,nombres);

    }
}
