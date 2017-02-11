/**
 * Auto Generated Java Class.
 */
public class PigLatinizeRay {
  
  public static void main(String args[]){
    System.out.print(pigLatinize("Hello"));
  }
  
  public static String pigLatinize(String str){
    return str.substring(1)+ str.substring(0,1) +"ay";
  }
  
  
}
