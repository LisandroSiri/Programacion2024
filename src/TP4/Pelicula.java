/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP4;

/**
 *
 * @author Lisandro
 */
public class Pelicula extends ContenidoMulti{
    public String director;
    
    public Pelicula (int calificacion, int año, int duracion, int repro, String titulo,String director){
        super(calificacion,año,duracion,repro,titulo);
        this.director = director;
   
    }
    
    @Override
    public void Info(){
        System.out.println("Titulo:"+titulo+
                "\nCalificaion:"+calificacion+
                "\nAño:"+año+
                "\nDuracion:"+duracion+
                "\nReproducciones:"+repro+
                "\nDirector:"+director );
    }
}
