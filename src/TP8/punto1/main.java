/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP8.punto1;

import java.util.Scanner;

/**
 *
 * @author Lisandro
 */
public class main {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("    Bienvenido a la maquin del tiempo de Lisandro    \nIngresa el año al cual desearias viajar: ");
        int x = teclado.nextInt();
        Viaje prueba = new Viaje(x);
        try{
        prueba.ViajeEnElTiempo(x);
        
        
        }catch (MaquinaException e){
            System.out.println(e.getMessage());
        }
        
    }
 
}
