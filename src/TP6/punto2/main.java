
package TP6.punto2;

import java.time.LocalDate;


public class main {
   public static void main (String[]args){
       Tarea desarrollo = new TareaDesarrollo(LocalDate.of(2024,8,19),LocalDate.of(2024,8,26),"Lisandro Siri");
        Tarea pruebas = new TareaPruebas(LocalDate.of(2024, 8, 26), LocalDate.of(2024, 8, 30), "Lucas Ruiz");
        Tarea documentacion = new TareaDocumentacion(LocalDate.of(2024, 9, 1), LocalDate.of(2024, 9, 7), "Ricardo Frias");      
   
       System.out.println(desarrollo.generarInformeProgreso());
        System.out.println(pruebas.generarInformeProgreso());
        System.out.println(documentacion.generarInformeProgreso());
   } 
       
}
