/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP2;

/**
 *
 * @author Lisandro
 */
public class Parametros {
    public int n1,n2;
    public double n3,n4;
    
    public Parametros(int n1, int n2, double n3, double n4){
        this.n1 = n1;
        this.n1=n2;
        this.n3 = n3;
        this.n4 = n4;
    
    }
    public void Enteros(int n1, int n2){
        System.out.println("Suma="+(n1+n2));
        System.out.println("Resta="+(n1-n2));
        System.out.println("Productor="+(n1*n2));
        if(n2!=0){
        System.out.println("Division="+(n1/n2));
        }else{
            System.out.println("No esta definida la division entre 0");
        }
       
    }

     public void Decimales (double n3, double n4){
              System.out.println("Suma="+(n3+n4));
        System.out.println("Resta="+(n3-n4));
        System.out.println("Productor="+(n3*n4));
        if(n2!=0){
        System.out.println("Division="+(n3/n4));
        }
        else{
          System.out.println("No esta definida la division entre 0");      
         }
        
        
    }
     
    
}
