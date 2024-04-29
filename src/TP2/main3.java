
package TP2;

public class main3 {

    public static void main(String[] args) {
        // Ejemplo de uso de los métodos
        int dia = 15;
        int mes = 4;
        int año = 2022;
        String fechaString = "01/01/2023";

        System.out.println("Días transcurridos ingresando día, mes y año: " + calcularDiasTranscurridos(dia, mes, año));
        System.out.println("Días transcurridos ingresando fecha en formato \"dd/mm/yyyy\": " + calcularDiasTranscurridos(fechaString));

        if (esBisiesto(año)) {
            System.out.println(año + " es un año bisiesto.");
        } else {
            System.out.println(año + " no es un año bisiesto.");
        }
    }
}
