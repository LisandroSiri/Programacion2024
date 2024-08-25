/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP6.punto1;

/**
 *
 * @author Lisandro
 */
public class Main {
    public static void main (String[]args){
        Altavoz dispositivo1 = new Altavoz("Alexa",false);
        Camara dispositivo2 = new Camara("CAM-1",false);
        Camara dispositivo3 = new Camara("CAM-2", false);
        Luces dispositivo4 = new Luces("Luz comedor",false);
        
        dispositivo1.ObtenerEstado(dispositivo1);
        dispositivo2.ObtenerEstado(dispositivo2);
        dispositivo3.ObtenerEstado(dispositivo3);
        dispositivo4.ObtenerEstado(dispositivo4);
        
        dispositivo1.Encender(dispositivo1);
        dispositivo2.Encender(dispositivo2);
        dispositivo3.Encender(dispositivo3);
        dispositivo4.Encender(dispositivo4);
        
        dispositivo1.ObtenerEstado(dispositivo1);
        dispositivo2.ObtenerEstado(dispositivo2);
        dispositivo3.ObtenerEstado(dispositivo3);
        dispositivo4.ObtenerEstado(dispositivo4);
    }
                
}
