/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP9;

/**
 *
 * @author Lisandro
 */
public class Empresa {
    public static void main(String[] args) {
        Desarrollador E1 = new Desarrollador("java","juan",45665603);
        E1.setHorasExtra(45);
        E1.setSueldoBase(130000);
        E1.mostrarInfo();
        
    }
}
