/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP3;
import static java.lang.Math. *;
/**
 *
 * @author Lisandro
 */
public class Electrodomesticos {
    public String electrodomestico;
    public double consumo;    
    public Electrodomesticos(String electrodomestico, double consumo){
        this.electrodomestico= electrodomestico;
        this.consumo= consumo;
    }   
       public void Calcularconsumos(){
           System.out.println("El consumo anual del electrodomestico es:"+consumo);
            double ahorro;
            ahorro = sqrt(consumo);
            round(ahorro);
            System.out.println("El consumo anual reducido del electrodomestico es:"+ahorro);
           
          
       }
        
   }