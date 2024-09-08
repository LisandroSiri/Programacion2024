
package TP7.ZOO;


public class Animal {
    private String nombre,especialidad,tipo;
    private int codigo,edad; 
    private double peso;
    private Dieta dieta;

    public Animal(String nombre, String especialidad, String tipo, int codigo, int edad, double peso, Dieta dieta) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.tipo = tipo;
        this.codigo = codigo;
        this.edad = edad;
        this.peso = peso;
        this.dieta = dieta;
    }
    



    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getEdad() {
        return edad;
    }    
    
    public String getInfo(){
        return "Animal\n"+
                "Nombre: "+nombre+"\n"+
                "Especialidad: "+especialidad+"\n"+
                "Codigo: "+codigo+"\n"+
                "Edad: "+edad+"\n"+
                "Tipo: "+tipo+"\n"+
                "Peso: "+peso+"\n"+
                "Dieta: "+dieta.getTipo()+","+dieta.getCodigo()+"\n";
    }
    
}
