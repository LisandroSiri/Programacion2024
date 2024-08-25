
package TP1;
import java.util.Scanner;

/**
 *
 * @author Lisandro
 */

public class ejercicio2 {
    public static void main(String[] args){
        
        
       Scanner entrada = new Scanner (System.in);
       float suma = 0;
       float prom;    
       float notas[]= new float[3];            
       for(int i=0;i<3;i++){
           System.out.println("Ingrese la nota: ");
           notas[i] = entrada.nextFloat();
           
         }
       for(int i=0;i<3;i++){
           suma += notas[i];
       }
       prom = suma /3;
       if(prom>=8){
           System.out.println("El alunmo esta promocionado, su nota es "+prom);
         }
       if(prom<8){
       System.out.println("El alumno no esta promocionado, su nota es: "+prom);
        }
       

        
   }
 }
