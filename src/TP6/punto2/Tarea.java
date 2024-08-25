
package TP6.punto2;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public abstract class Tarea {
    private String nombre;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private String responsable;

    public Tarea(String nombre, LocalDate fechaInicio, LocalDate fechaFin, String responsable) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.responsable = responsable;
    }

    public long calcularTiempoInvertido() {
        return ChronoUnit.DAYS.between(fechaInicio, fechaFin);
    }

    public abstract String generarInformeProgreso();

    public String getNombre() {
        return nombre;
    }

    public String getResponsable() {
        return responsable;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }
}