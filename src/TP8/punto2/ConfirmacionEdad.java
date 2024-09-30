package TP8.punto2;
import java.time.LocalDate;
import java.time.Period;

public class ConfirmacionEdad {
    public void CalcularEdad(LocalDate nacimiento,LocalDate actual)
        throws EdadException{
        int edad = Period.between(nacimiento,actual).getYears();
        if(edad<13&&edad>0){
            throw new EdadException("Lo siento, los menores de 13 no pueden tener acceso a la red social.");
        }
        else if(edad>13&&edad<18){
            System.out.println("BIENVENIDO, la red social cuenta con restricciones de edad!");
            
        }else if(edad<0){
            throw new EdadException("ERROR, la edad no puede ser menor de 0, reingrese una fecha valida.");
        }else if(edad>18){
            System.out.println("BIENVENIDO, usted cuenta con total acceso a la red social");
        }
            
        
    }
}
