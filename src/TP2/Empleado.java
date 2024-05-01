package TP2;
import java.util.Scanner;

public class Empleado{
    public int edad, sueldo;
    public String nombre,apellido;
    
    
    public Empleado(String nombre, String apellido,int edad, int sueldo){
    this.nombre = nombre;
    this.apellido = apellido;
    this.edad = edad;
    this.sueldo = sueldo;
    }

   
   public void MostrarDatos(boolean mostrar){
       System.out.println("Nombre:"+nombre+"\nApellido:"+apellido+"\nEdad:"+edad);
       if(mostrar== true){
           System.out.println("Sueldo:"+sueldo);
        }
   }
   public void Incrementarsueldo(int incremento){
       sueldo += incremento;
       System.out.println("El sueldo ahora es de:"+sueldo);             
   }
   
   public void Incrementarsueldoporcentaje(int porcentaje) {
        int aumento = sueldo * (porcentaje / 100);
        sueldo = sueldo + aumento;
        System.out.println("El sueldo ahora es de:"+sueldo); 
    }
   

}

