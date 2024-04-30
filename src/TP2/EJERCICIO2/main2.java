
package TP2;
import java.util.Scanner;
/**
 *
 * @author Lisandro
 */
public class main2 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese dos numeros enteros:");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        System.out.println("Ingrese dos numeros decimales:");
        double n3 = scanner.nextDouble();
        double n4 = scanner.nextDouble();
        
        Parametros parametros1 = new Parametros(n1,n2,n3,n4);
         System.out.println("Operaciones con enteros");
        parametros1.Enteros(n1, n2);
         System.out.println("Operaciones con decimales");
        parametros1.Decimales(n3, n4);
                

    }
}

