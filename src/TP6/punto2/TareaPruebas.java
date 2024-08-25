/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP6.punto2;

import java.time.LocalDate;

/**
 *
 * @author Lisandro
 */
public class TareaPruebas extends Tarea {
    public TareaPruebas(LocalDate fechaInicio, LocalDate fechaFin, String responsable) {
        super("Pruebas de Calidad", fechaInicio, fechaFin, responsable);
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
