
package TP2;
import java.util.Scanner;
/**
 *
 * @author Lisandro
 */
public class main1 {
   public static void main(String[]args){
      Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese nombre del empleado:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese apellido del empleado:");
        String apellido = scanner.nextLine();

        System.out.println("Ingrese edad del empleado:");
        int edad = scanner.nextInt();

        System.out.println("Ingrese salario del empleado:");
        int sueldo = scanner.nextInt(); 
   
        Empleado empleado1= new Empleado(nombre, apellido, edad, sueldo);
        
        empleado1.MostrarDatos(false);        
        empleado1.Incrementarsueldo(10000);
        empleado1.Incrementarsueldoporcentaje(15);
        
        
   
   } 
}
