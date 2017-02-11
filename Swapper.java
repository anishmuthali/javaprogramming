/**
 * Auto Generated Java Class.
 */
public class Swapper {
  
  public static void main(String[] args){
    int a = 7; 
    int b = 35; 
    int[] array= new int[2];
    swap(a, b, array);
    System.out.println(array[0]+" "+array[1]);
  }
  public static int[] swap(int a, int b, int[] ray){
    ray[0]=b;
    ray[1]=a;
    return ray;
  }
  
}
