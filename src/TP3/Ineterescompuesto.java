
package TP3;

/**
 *
 * @author Lisandro
 */
public class Ineterescompuesto {
     public static void main(String[]args){
         double valorfuturo;
         double tasa= 1.00+0.06;
         valorfuturo = 10000*Math.pow(tasa,5);
         
         System.out.println("El valor futuro de la inversion es de:"+valorfuturo);
         System.out.println("El valor redondeado de la inversion es de:"+Math.floor(valorfuturo) );
         System.out.println("El valor redondeado de la inversion es de:"+Math.round(valorfuturo) );
         //el .coil muestra el valor redondeado como un decimal
         //mientras que el .round como un entero
     }
}
