/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP6.punto3;

/**
 *
 * @author Lisandro
 */
public class Ropa extends Productos{
    protected char talle;
    
    public Ropa(char talle, String nombre, int precio, int cantidad) {
        super(nombre, precio, cantidad);
        this.talle = talle;
    }

    @Override
    public String Info(){
              return "Nombre: "+nombre+"\n"+
                "Precio: "+precio+"\n"+
                "Cantidad: "+cantidad+ "\n"+
                "Talle "+talle+"\n";
    }    
    @Override
    public String detalles(){
        return "Material: 100% algodon peinado";
               
                
    }
    
    
}
