
package TP2;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
/**
 *
 * @author Lisandro
 */
public class fechas {
  
    public  long calcularDiasTranscurridos(int dia, int mes, int año) {
        LocalDate fechaIngresada = LocalDate.of(año, mes, dia);
        LocalDate fechaActual = LocalDate.now();
        return ChronoUnit.DAYS.between(fechaIngresada, fechaActual);
    }

    
    public  long calcularDiasTranscurridos(String fecha) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaIngresada = LocalDate.parse(fecha, formatter);
        LocalDate fechaActual = LocalDate.now();
        return ChronoUnit.DAYS.between(fechaIngresada, fechaActual);
    }

   
    public  boolean esBisiesto(int año) {
        return (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);
    }
}
