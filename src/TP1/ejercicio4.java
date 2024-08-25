package TP1;
import java.util.Scanner;
/**
 *
 * @author Lisandro
 */
public class ejercicio4 {
   public static void main(String[] args){
     Scanner fecha = new Scanner(System.in);
     int dia,mes,año;
       System.out.println("Ingrese el dia:");
       dia= fecha.nextInt();
       System.out.println("Ingrese el mes");
       mes= fecha.nextInt();
       System.out.println("Ingrese el año");
       año= fecha.nextInt();
       
       if(dia<=31){
           if(mes<=12){
               if(mes<=3){
                 System.out.println("La fecha corresponde a el primer cuatrimestre:"+dia +("/")+mes +("/")  +año);  
                }
               if(mes>=4&&mes<=6){
                  System.out.println("La fecha corresponde a el segundo cuatrimestre:"+dia +("/")+mes +("/")  +año); 
               }
               if(mes>=7&&mes<=9){
                   System.out.println("La fecha corresponde a el tercer cuatrimestre:"+dia +("/")+mes +("/")  +año);
               }
               if(mes>=8&&mes<=12){
                   System.out.println("La fecha corresponde a el cuarto cuatrimestre:"+dia +("/")+mes +("/")  +año);
               }
            }
             
           }
       }      
       
               
       
       
       
       
       
       
   } 

