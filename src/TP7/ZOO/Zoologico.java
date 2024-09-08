
package TP7.ZOO;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.io.*;
public class Zoologico {
        private List<Animal> animales;
        private List<Cuidador> cuidadores;
        private List<Habitad> habitats;
        private List<Dieta> dietas;
   
        
        public Zoologico() {
        this.animales = new ArrayList<>();
        this.cuidadores = new ArrayList<>();
        this.habitats = new ArrayList<>();
        this.dietas = new ArrayList<>();
    }      
        
        //public void mostraranimales(animales){
            
        //}
        
        public void escribirAnimales(){
           try{
               File file = new File("archivoAnimales.csv");
               FileWriter fileReader = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileReader);
            
            for(Animal animal : animales){
                
            bufferedWriter.write(animal.getInfo());
           }
            bufferedWriter.close();
        }catch(IOException e){
               System.out.println("ERRro");
        }
        }
}
