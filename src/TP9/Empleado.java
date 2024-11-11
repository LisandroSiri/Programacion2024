/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP9;

/**
 *
 * @author Lisandro
 */
public abstract class Empleado{
    private String nombre;
    private int dni;
    private double sueldoBase;

    public Empleado(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        return dni;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }
    
    public void mostrarInfo(){
        
    }
    
}
