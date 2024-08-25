
 
package TP6.punto2;

import java.time.LocalDate;


class TareaDesarrollo extends Tarea {
    public TareaDesarrollo(LocalDate fechaInicio, LocalDate fechaFin, String responsable) {
        super("Desarrollo de Software", fechaInicio, fechaFin, responsable);
    }
    
     @Override
    public String generarInformeProgreso() {
        return "Informe de Progreso - " + getNombre() + ":\n" +
                "Responsable: " + getResponsable() + "\n" +
                "Fecha de inicio: " + getFechaInicio() + "\n" +
                "Fecha de fin: " + getFechaFin() + "\n" +
                "Dias invertidos: " + calcularTiempoInvertido() + "\n";
    }
}