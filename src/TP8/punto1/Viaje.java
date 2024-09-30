package TP8.punto1;



public class Viaje {
   public int año;

    public Viaje(int año) {
        this.año = año;
    }

   
    public void ViajeEnElTiempo(int año)
       throws MaquinaException{
        if(año<1900 || año>2100){
            throw new MaquinaException("¡TEN CUIDADO, viajar tantos años en el tiempo sin conocer puede traer problemas!");
             }
        System.out.println("Viajando al "+año+".........\nHas llegado!");
        }
    }

      
      
      
    
    
    

