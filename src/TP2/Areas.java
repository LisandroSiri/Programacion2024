
package TP2;

/**
 *
 * @author Lisandro
 */
public class Areas {
    public double lado1, lado2;
    public Areas(double lado1){
        this.lado1= lado1;
    }
    public Areas(double lado1,double lado2){
       this.lado1= lado1;
       this.lado2= lado2;      
    }
    
         
    public void AreaCuadrado(double lado1){
        System.out.println("El area es="+(lado1*lado1));
        System.out.println("El perimetro="+(lado1*4));
        
    }
    public void AreaRectangulo(double lado1, double lado2){
        System.out.println("El area es="+(lado1*lado2));
        System.out.println("El perimetro="+(lado1+lado2)*2); 
    }
    public void AreaCirculo(double radio){
        System.out.println("El area es="+(Math.PI*lado1*lado1));
        System.out.println("El perimetro="+(2*Math.PI*lado1));
    }
}
