/**
 * Auto Generated Java Class.
 */
import java.lang.*;
public class ProgrammingProjectsRay {
  public static void main(String[] args){
    printColumns(5,8);
    average3(15, 22, -1);
    grade(78);
  }
public static void printColumns(int x, int y){
  int max = Math.max(x,y);
  int min = Math.min(x,y);
  for (int i = 1; i <= max; i++){
    System.out.print(i);
    
    for (int j = 1; j<=min; j++){
      
      System.out.print(" ");
    }
  }
  
  
}
public static int average3(int x, int y, int z){
  return (x+y+z)/3;
  
  
}
public static double grade(int x){
  int g = x-60;
  int hi = Math.max(0, g);
  double yo = 1.0;
  for (int d = g; d == hi; d++){
    yo = (double) hi/10;
  }
  return yo;

}
  
  
}

