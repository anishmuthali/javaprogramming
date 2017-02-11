/**
 * Auto Generated Java Class.
 */
public class DigitSum {
  
  public static void main(String args[]){
    System.out.print(digitCount(21));
  }
  
  public static int digitSum(int a){
    int x=0;
    while (a>0){
      x+=a%10;
      a/=10;
    }
    return x;
}
  public static int digitCount(int a){
    int x=0;
    while(a>0){
      a/=10;
      x++;
    }
    return x;
  }
}
