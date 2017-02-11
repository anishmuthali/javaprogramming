import java.*;
public class GCFRay {
  
  public static void main(String[] args){
    System.out.println(GCF(345, 300));
    System.out.println(GCFrecursion(345, 300));
  }
  //my method
  public static int GCF(int a, int b){
    int max = Math.max(a, b);
    int min = Math.min(a, b);
    while(max%min!=0){
      int temp = min;
      min = max%temp;
      max = temp;   
    }
    return min;
  }
  //recursion method
  public static int GCFrecursion(int a, int b){
    if(a>b) a=a-b;
    if(b>a) b=b-a;
    if(a==b) return a;
    else return GCFrecursion(a, b);
  }
 
  
}
