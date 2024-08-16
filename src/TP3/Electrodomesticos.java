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
    public double CalcularGasto(double consumo1,double consumo2,double consumo3,double consumo4,double consumo5,double consumo6,){
        double gastototal;
        for(int i=0; i<6; i++)
         gastototal +=  consumo[i]; 
        
    }
    
   public double CalcularAhorro(double consumo){
          double ahorro = sqrt(consumo);
          return ahorro;
       }
        
   }