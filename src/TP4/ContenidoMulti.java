
package TP4;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ContenidoMulti {
 public int calificacion, año, duracion, repro;
 public String titulo;

    public ContenidoMulti(int calificacion, int año, int duracion, int repro, String titulo) {
        this.calificacion = calificacion;
        this.año = año;
        this.duracion = duracion;
        this.repro = repro;
        this.titulo = titulo;
    }
    
    public void reproducir(){
        JOptionPane.showMessageDialog(null, "reproduciendo: "+titulo, titulo+".mp4",2);
    }
    public void Info(){
        System.out.println("Titulo:"+titulo+
                "\nCalificaion:"+calificacion+
                "\nAño:"+año+
                "\nDuracion:"+duracion+
                "\nReproducciones"+repro);
    }
    
   /* public String popularidad(){
        for(ContenidoMulti  : repro ){
            
        }
    }*/
 
 
}
