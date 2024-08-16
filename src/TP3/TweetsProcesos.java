
package TP3;

/**
 *
 * @author Lisandro
 */
public class TweetsProcesos {
   public String tweet;
   public TweetsProcesos(String tweet){
       this.tweet= tweet;
   }
  public void LimiteCaracteres(String tweet){
      if (tweet.length()<=280){
          System.out.println("Caracteres:"+tweet.length());
      }
      else{
          System.out.println("Supera el limite de caracteres");
      }
  }
  public void Hastag(String tweet, String hastag){
      System.out.println(tweet+" #"+hastag);
  }
  public void ExtraerUsuario(String tweet){
      int lugar = tweet.indexOf("@");
      int vacio= tweet.indexOf("",lugar);
          
              String usuario = tweet.substring(lugar,vacio);
              System.out.println(""+usuario);
          }
  
   public static String construirTweet(String... fragmentos) {
        StringBuilder sb = new StringBuilder();
        for (String fragmento : fragmentos) {
            sb.append(fragmento);
        }
        return sb.toString();
    }
      }                
          
  

  
  
     