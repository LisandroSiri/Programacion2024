
package TP8.punto3;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Ingrese el monto total de la cuenta: $");
        double montoCuenta = scanner.nextDouble();

        
        System.out.print("Ingrese la cantidad que desea dejar de propina: $");
        double montoPropina = scanner.nextDouble();
  
        double propinaMinima = montoCuenta * 0.10;
      

        
        if (montoPropina < propinaMinima) {
            System.out.println("Error: La propina ingresada es menor al 10% del total de la cuenta.");
            System.out.printf("La propina minima recomendable es: $%.2f\n", propinaMinima);
        } else {
            System.out.println("Gracias por su generosa propina.");
            System.out.printf("Total a pagar (incluyendo propina): $%.2f\n", montoCuenta + montoPropina);
        }

       
    }
}

