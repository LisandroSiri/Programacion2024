/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PlataformaStream;

/**
 *
 * @author Lisandro
 */
public class pricipal {
    public static void main(String[]args){
        
        Catalogo catalogo = new Catalogo();
        
        Pelicula contenido1 = new Pelicula(10,2023,120,10000,"Gordos nazis la secuela","Geronimo Benavides");
        Serie contenido2 = new Serie(9,2005,900,22000,"Road to Ingeniero",7,3);
        Documental contenido3 = new Documental(5,2022,90,5000,"La pandemia","Historia del covid-19");
        
        
        contenido1.Info();
        contenido1.reproducir();
        
        catalogo.AgregarContenido(contenido1);
        catalogo.AgregarContenido(contenido2);
        catalogo.AgregarContenido(contenido3);
        
        catalogo.MostrarCatalogo();
        
        catalogo.OredenarPopularidad();
        
        catalogo.MostrarCatalogo();
        
               
    }
}
