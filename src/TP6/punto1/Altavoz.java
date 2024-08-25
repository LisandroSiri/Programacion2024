/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP6.punto1;

/**
 *
 * @author Lisandro
 */
public class  Altavoz extends Dispositivos {
    
    public Altavoz(String Nombre, boolean estado) {
        super(Nombre, estado);
    }
    
    @Override
        public void ObtenerEstado(Dispositivos dispositivo){
                if( dispositivo.estado == true){
            System.out.println("Altavoz encendido, en que puedo ayudarte?");
        }else{
            System.out.println("El altavoz esta apagado");
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
