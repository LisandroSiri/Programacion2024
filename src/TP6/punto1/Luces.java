
package TP6.punto1;


public class Luces extends Dispositivos{
    
    public Luces(String Nombre, boolean estado) {
        super(Nombre, estado);
    }
            @Override
        public void ObtenerEstado(Dispositivos dispositivo){
        if( dispositivo.estado == true){
            System.out.println("Luz encendida");
        }else{
            System.out.println("Luz apagada");
        }
       }
    @Override
         public void Encender (Dispositivos dispositivo){
        dispositivo.estado = true;
        System.out.println("El dispositivo "+dispositivo.getNombre()+ " se encendio correctamente");
    }
    
    @Override
    public void Apagar(Dispositivos dispositivo){
        dispositivo.estado = false;
        System.out.println("El dispositivo "+dispositivo.getNombre()+ " se apago correctamente");
    }
}
