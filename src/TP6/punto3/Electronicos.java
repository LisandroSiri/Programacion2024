
package TP6.punto3;


public class Electronicos extends Productos {
    protected int garantia;
    
    public Electronicos(int garantia, String nombre, int precio, int cantidad) {
        super(nombre, precio, cantidad);
        this.garantia = garantia;
    }
    
    @Override
    public String Info(){
        return "Nombre: "+nombre+"\n"+
                "Precio: "+precio+"\n"+
                "Cantidad: "+cantidad+ "\n"+
                "Garantia: "+garantia+" Años\n";
    }
}
