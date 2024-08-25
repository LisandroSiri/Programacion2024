
package TP2;
import java.util.Scanner;
/**
 *
 * @author Lisandro
 */
public class main4 {
    public static void main(String[] args){
         Scanner scanner = new Scanner(System.in);

        
        System.out.println("Seleccione la figura:");
        System.out.println("1. Cuadrado");
        System.out.println("2. Rectangulo");
        System.out.println("3. Circulo");
        int opcion = scanner.nextInt();

        switch (opcion){
            case 1: System.out.println("Ingrese el lado del cuadrado:");
                double ladoCuadrado = scanner.nextDouble();
                Areas a1 = new Areas(ladoCuadrado);
                a1.AreaCuadrado(ladoCuadrado);
                
                break;
            case 2:
                System.out.println("Ingrese la base del rectangulo:");
                double baseRectangulo = scanner.nextDouble();
                System.out.println("Ingrese la altura del rectangulo:");
                double alturaRectangulo = scanner.nextDouble();
                Areas a2= new Areas(baseRectangulo,alturaRectangulo);
                a2.AreaRectangulo(baseRectangulo, alturaRectangulo);
            case 3:
                System.out.println("Ingrese el radio del circulo:");
                double radioCirculo = scanner.nextDouble();
                Areas a3= new Areas(radioCirculo);
                a3.AreaCirculo(radioCirculo);
                break;
            default:
                System.out.println("Opción no válida.");
        }
                
        }
    }

