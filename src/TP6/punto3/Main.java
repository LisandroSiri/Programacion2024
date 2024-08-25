/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP6.punto3;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Lisandro
 */
public class Main {
    public static void main(String[]args){
        
        Productos producto1 = new Electronicos(5,"Smart Tv Samsung 57´",5700000,11);
        Productos producto2 = new Ropa('M',"Remera estampada Quicksilver",10000,22);
        Productos producto3 = new Alimentos(LocalDate.of(2025,8,29),"Snacks jamon serrano",900,100);
        
        System.out.println(producto1.Info());
        System.out.println(producto2.Info());
        System.out.println(producto3.Info());
        
        producto3.consumir();
        System.out.println(producto2.detalles());
    }
}
