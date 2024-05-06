
package TP3;
import java.util.Scanner;
/**
 *
 * @author Lisandro
 */
public class Tweet {
   public static void main (String[]args){
      Scanner tt = new Scanner(System.in);
      String tweet; 
      String hastag= "LearningJava";
      System.out.println("Escriba un tweet!");
           tweet= tt.nextLine();
        TweetsProcesos tweet1 = new TweetsProcesos(tweet); 
            tweet1.LimiteCaracteres(tweet);
        tweet1.Hastag(tweet,hastag);
        tweet1.ExtraerUsuario(tweet);
        tweet1.construirTweet();
             
      
       
       
    }
}
    
    

