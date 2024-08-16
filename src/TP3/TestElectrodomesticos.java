package TP3;

/**
 *
 * @author Lisandro
 */
public class TestElectrodomesticos {
    public static void main(String[]args){
       Electrodomesticos electrodomestico1 = new Electrodomesticos("Horno",240.00); 
       Electrodomesticos electrodomestico2 = new Electrodomesticos("Lavaropa",264.00);
       Electrodomesticos electrodomestico3 = new Electrodomesticos("Television",220.00);
       Electrodomesticos electrodomestico4 = new Electrodomesticos("Heladera",637.00);
       Electrodomesticos electrodomestico5 = new Electrodomesticos("Aire acondicionado",1264.00);
       Electrodomesticos electrodomestico6 = new Electrodomesticos("Pava electrica",25.00);
       
       electrodomestico1.Calcularconsumos();
       
       electrodomestico2.Calcularconsumos();
       
       electrodomestico3.Calcularconsumos();
       
       electrodomestico4.Calcularconsumos();
       
       electrodomestico5.Calcularconsumos();
       
       electrodomestico6.Calcularconsumos();
       
       
       
    }
}
