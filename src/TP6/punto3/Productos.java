
package TP6.punto3;


public abstract class Productos {
    protected String nombre;
    protected int precio;
    protected int cantidad;
    public Productos(String nombre, int precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    
    public abstract String Info();
    
    public void consumir(){
        
    }
    public String detalles(){
        return " ";
    }
}
