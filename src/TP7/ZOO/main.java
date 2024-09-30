/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP7.ZOO;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lisandro
 */
public class main {

    

    

    public static void main(String[] args) {
        Zoologico zoo1 = new Zoologico();
        Dieta d1 = new Dieta(0, "Carnivoro");
        Animal a1 = new Animal("oracio", "qsy", "mamifero", 001, 2, 100.00,d1);
        //List<Animal> asd = new ArrayList<>();
        //asd.add(a1);
        
        System.out.println(a1.getInfo());
        
//zoo1.escribirAnimales(asd);
    }
}
