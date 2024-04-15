package TP1;
import java.util.Scanner;
/**
 *
 * @author Lisandro
 */
public class ejercicio5 {
    public static void main(String[] args){
      Scanner cord = new Scanner(System.in); 
      int x,y;
        System.out.println("Ingrese las cordenadas de x e y:");
        x= cord.nextInt();
        y= cord.nextInt();
        if(x>0&&y>0){
            System.out.println("Las cordenadas pertenecen al Primer cuadrante");
        }
        if(x<0&&y>0){
            System.out.println("Las cordenadas pertenecen al Segundo cuadrante");           
        }
        if(x>0&&y<0){
            System.out.println("Las cordenadas pertenecen al Cuarto cuadrante");  
        }
        if(x<0&&y<0){
            System.out.println("Las cordenadas pertenecen al Tercer cuadrante");  
        }
        

        
    }
}
