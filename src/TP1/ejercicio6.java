package TP1;
import java.util.Scanner;
/**
 *
 * @author Lisandro
 */
public class ejercicio6 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cantidadtriangulos,lado1,lado2,lado3;
        
        System.out.print("Ingrese la cantidad de triangulos a analizar: ");
        cantidadtriangulos = scanner.nextInt();
        
        int equilateros = 0;
        int isosceles = 0;
        int escalenos = 0;
        
        for (int i = 1; i <= cantidadtriangulos; i++) {
            System.out.println("Triangulo N°" + i);
            System.out.print("Ingrese la longitud del lado 1: ");
               lado1 = scanner.nextInt();
            System.out.print("Ingrese la longitud del lado 2: ");
              lado2 = scanner.nextInt();
            System.out.print("Ingrese la longitud del lado 3: ");
               lado3 = scanner.nextInt();
            
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Este triangulo es equilatero.");
                equilateros++;
            } 
            else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Este triangulo es isosceles.");
                isosceles++;
            } 
            else {
                System.out.println("Este triangulo es escaleno.");
                escalenos++;
            }
        }
        
        System.out.println("Cantidad de triangulos equilateros: " + equilateros);
        System.out.println("Cantidad de triangulos isosceles: " + isosceles);
        System.out.println("Cantidad de triangulos escalenos: " + escalenos);
        
        
        if (equilateros <= isosceles && equilateros <= escalenos) {
            System.out.println("El tipo de triangulo con menor cantidad es equilatero.");
        }
        else if (isosceles <= escalenos) {
            System.out.println("El tipo de triángulo con menor cantidad es isosceles.");
        } 
        else {
            System.out.println("El tipo de triángulo con menor cantidad es escaleno.");
        }
        
     }
}

    
