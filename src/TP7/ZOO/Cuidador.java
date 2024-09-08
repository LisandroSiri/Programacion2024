
package TP7.ZOO;


public class Cuidador {
    private int codigo;
    private String nombre,especialidad;

    public Cuidador(int codigo, String nombre, String especialidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }
    public String getInfo(){
        return "Cuidador\n"+
                "Codigo: "+codigo+"\n"+
                "Nombre: "+nombre+"\n"+
                "Especialidad: "+especialidad+"\n";
    }
}
