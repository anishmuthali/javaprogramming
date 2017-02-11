/**
 * Auto Generated Java Class.
 */
public class NumberCube {
  
  public static void main(String[] args){
    int x= (int)(Math.random() * (6 - 1+1) +1);
    threeHeads();
   
  }
  public static void threeHeads(){
    int i=0;
    while (i!=3){
      int y= (int)(Math.random() * (2 - 1+1) +1);
    if (y== 2){
      System.out.print("T ");
        i=0;
    }else{
      System.out.print("H ");
      i++;
    }
    }
    System.out.println("Three heads in a row!");
  }
}
