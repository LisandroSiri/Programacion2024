/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP4;

/**
 *
 * @author Lisandro
 */
public class Documental extends ContenidoMulti{
    public String tema;
    
    public Documental (int calificacion, int año, int duracion, int repro, String titulo,String tema){
        super(calificacion,año,duracion,repro,titulo);
        this.tema = tema;
    }
    
    @Override
        public void Info(){
        System.out.println("Titulo:"+titulo+
                "\nCalificaion:"+calificacion+
                "\nAño:"+año+
                "\nDuracion:"+duracion+
                "\nReproducciones:"+repro+
                "\nTema:"+tema );
    }
}
    

