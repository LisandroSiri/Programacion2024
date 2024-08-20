/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PlataformaStream;

/**
 *
 * @author Lisandro
 */
public class Serie extends ContenidoMulti{
    public int temporada, capitulosxt;
    
    public Serie (int calificacion, int año, int duracion, int repro, String titulo,int temporada, int capitulosxt){
        super(calificacion,año,duracion,repro,titulo);
        this.capitulosxt = capitulosxt;
        this.temporada = temporada;

    }
    
    @Override
            public String Info(){
        return "Titulo:"+titulo+
                "\nCalificaion:"+calificacion+
                "\nAño:"+año+
                "\nDuracion:"+duracion+
                "\nReproducciones:"+repro+
                "\nTemporadas:"+temporada+
                "\nCapitulos por Temporadas:"+capitulosxt;
    }
}
