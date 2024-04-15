
package TP1;

import java.util.Scanner;
/**
 *
 * @author Lisandro
 */
public class Ejercicio1 {

   
    public static void main(String[] args) {
        Scanner notas = new Scanner(System.in);
        System.out.println("Ingrese la nota de Programacion II:");
        int x = notas.nextInt();//la nota solo puede ser cargada como un entero.
       if(x==10){
           System.out.println("El alumno es sobresaliente en la materia, su nota es:"+x);
       }
       else if (x>=4) {
        System.out.println("El alumno esta aprobado en la materia, su nota es:"+x);
       }      
       else if(x<4){   
        System.out.println("El alumnno esta desaprobbado en la materia;su nota es:"+x);
       }          
    }  
}
