/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP6.punto3;

import java.time.LocalDate;

/**
 *
 * @author Lisandro
 */
public class Alimentos extends Productos{
    protected LocalDate vencimiento;

    public Alimentos(LocalDate vencimiento, String nombre, int precio, int cantidad) {
        super(nombre, precio, cantidad);
        this.vencimiento = vencimiento;
    }
    
    @Override
    public String Info(){
              return "Nombre: "+nombre+"\n"+
                "Precio: "+precio+"\n"+
                "Cantidad: "+cantidad+ "\n"+
                "Fecha de vencimiento "+vencimiento+"\n";
    }
    
    public void consumir(){
        System.out.println("Hoy es: "+LocalDate.now()+"\n"+
                "Consumir antes de: "+vencimiento);
        
    }
}
    