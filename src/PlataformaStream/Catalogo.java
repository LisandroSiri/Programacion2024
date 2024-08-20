/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PlataformaStream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Lisandro
 */
public class Catalogo {
    public List<ContenidoMulti> contenidos;

    public Catalogo(List<ContenidoMulti> contenidos) {
        this.contenidos = new ArrayList<>();
    }

    Catalogo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public void AgregarContenido (ContenidoMulti contenido){
        contenidos.add(contenido);
        System.out.println("Se agrego "+contenido.titulo+" al catalogo");
    }
    
    public void BorrarContenido(ContenidoMulti contenido){
        contenidos.remove(contenido);
        System.out.println("Se quito "+contenido.titulo+" del catalogo");
    }
    
    public void OredenarPopularidad(){
        Collections.sort(contenidos,Comparator.comparingInt(ContenidoMulti::getCalificacion).reversed());
    }
    
    public void MostrarCatalogo(){
        for (ContenidoMulti contenido : contenidos){
               System.out.println(contenido.Info());
        }
    }
    
    
}
