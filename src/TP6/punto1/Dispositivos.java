
package TP6.punto1;


public abstract class Dispositivos {
    protected String Nombre;
    protected boolean estado;
    

    public Dispositivos(String Nombre, boolean estado) {
        this.Nombre = Nombre;
        this.estado = estado;
    }

    public String getNombre() {
        return Nombre;
    }

    public boolean getEstado() {
        return estado;
    }
    
    public void ObtenerEstado(Dispositivos dispositivo){
        
        
    }
    
    public void Encender (Dispositivos dispositivo){
           }
    
    public void Apagar(Dispositivos dispositivo){
    }
}

