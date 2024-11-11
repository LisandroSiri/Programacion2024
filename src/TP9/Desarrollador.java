/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP9;

/**
 *
 * @author Lisandro
 */
public class Desarrollador extends Empleado implements Empleados {
   private String LenguajePrincipal;
   private int HorasExtra;

    public Desarrollador(String LenguajePrincipal, String nombre, int dni) {
        super(nombre, dni);
        this.LenguajePrincipal = LenguajePrincipal;
        
    }

    public void setHorasExtra(int HorasExtra) {
        this.HorasExtra = HorasExtra;
    }

    
    public String getLenguajePrincipal() {
        return LenguajePrincipal;
    }

    public int getHorasExtra() {
        return HorasExtra;
    }
    
   @Override
    public double CalcularSueldo(){
       double sueldo = 0;
       sueldo += getSueldoBase();
       return sueldo;
    }
    
    
   @Override
    public void mostrarInfo(){
        System.out.print("Nombre: "+getNombre()+"\n"+
        "DNI: "+getDni()+"\n"+
        "Sueldo Base: "+getSueldoBase()+"\n"+
        "Lenguaje principal: "+getLenguajePrincipal()+"\n"+
        "Horas Extras: "+getHorasExtra()+"\n"+
        "Sueldo: "+CalcularSueldo());
    
        
    }
    
}
