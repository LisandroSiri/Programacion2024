
package TP7.ZOO;
import java.util.ArrayList;
import java.util.List;

public class Habitad {
    private int codigo;
    private String nombre;
    private String tipo;
    private int cantidad;
    private List<Animal> animales;

    public Habitad(int codigo, String nombre, String tipo, int cantidad, List<Animal> animales) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.animales = new ArrayList<>();
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public List<Animal> getAnimales() {
        return animales;
    }
    
    public void AgregrarAnimal(Animal animal){
        if(animales.size()< cantidad){
            animales.add(animal);
        }else{
            System.out.println("¡Habitad lleno no se puede ingresar al animal!");
        }
    }
    
    public String getInfo(){
        return "Habitad\n"+
                "Codigo: "+codigo+"\n"+
                "Tipo; "+tipo+"\n"+
                "Capacidad: "+cantidad+"\n"+
                "Animales: "+animales+"\n";
    }
}
