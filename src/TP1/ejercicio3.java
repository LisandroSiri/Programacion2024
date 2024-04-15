package TP1;
import java.util.Scanner;
/**
 *
 * @author Lisandro
 */
public class ejercicio3 {
    public static void main(String[] args){
        int x;
        Scanner numero = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        x = numero.nextInt();
        
       if(x>99){
                System.out.println("El numero es demasiado grande");                
        }        
              
        if(x<10){
            System.out.println("El numero es de un solo digito");
        }
        if(x>=10&&x<=99){
        System.out.println("El numero es de dos digitos");
        
        }
        
        
      
        
        
        
    }
}
