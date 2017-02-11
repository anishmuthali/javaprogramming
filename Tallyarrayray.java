/**
 * Auto Generated Java Class.
 */
import java.util.*;
public class Tallyarrayray {
  
  public static void main(String[] args){
    int[] tally = new int[103];
    int[] scores = {1,2,3,4,5,6,7,8,9,9,1,7,1,3,34,5,3,2,45,30,1,2,3,4,5,6,7,8,9,9,1,7,1,3,34,5,3,2,45,30,1,2,3,4,5,6,7,8,9,9,1,7,1,3,34,5,3,2,45,30,1,2,3,4,5,6,7,8,9,9,1,7,1,3,34,5,3,2,45,30,1,2,3,4,5,6,7,8,9,9,1,7,1,3,34,5,3,2,45,30,1,2,3,4,5,6,7,8,9,9,1,7,1,3,34,5,3,2,45,30,1,2,3,4,5,6,7,8,9,9,1,7,1,3,34,5,3,2,45,30,1,2,3,4,5,6,7,8,9,9,1,7,1,3,34,5,3,2,45,30,1,2,3,4,5,6,7,8,9,9,1,7,1,3,34,5,3,2,45,30,1,2,3,4,5,6,7,8,9,9,1,7,1,3,34,5,3,2,45,30,1,2,3,4,5,6,7,8,9,9};
    NumberFrequencies(scores, tally);
    
  }
  
  public static void NumberFrequencies(int[] scores, int[] tally){
    for(int i=0;i<scores.length;i++){
      tally[scores[i]]++;
    }
    for(int j=0; j<tally.length;j++){
      System.out.println("People who scored "+j+"% is "+tally[j]);
    }
    
  }
  public static void LetterFrequencies(String a, String[] tally){
    for(int i =0; i<tally.length();i++){
      char character = s.substring(i,i+1);
    }
  }
  
}
