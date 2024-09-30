package TP8.punto2;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.Month;

public class main {
    public static void main(String[] args) {
        ConfirmacionEdad num1 = new ConfirmacionEdad();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la fecha de su nacimiento en el siguiente orden (DD/MM/YYYY)");
        int dia = entrada.nextInt();
        int mes = entrada.nextInt();
        int año = entrada.nextInt();
        LocalDate nacimiento = LocalDate.of(año, mes, dia);
        LocalDate actual = LocalDate.now();
       try{
        num1.CalcularEdad(nacimiento, actual);
       }
       catch(EdadException e){
           System.out.println(e.getMessage());
        }
        
    }
}
