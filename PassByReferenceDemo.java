/**
 * Auto Generated Java Class.
 */
public class PassByReferenceDemo {
  
  public static void main (String args[]){
    double[] dubArray = {0.0, 0.1, 0.2};
    
    System.out.println(dubArray);
    changeArray(dubArray,0,1);
    System.out.println(dubArray[0]+" "+dubArray[1]);
  }
  public static void changeArray(double[] arr, int from, int to){
    System.out.println(arr);
    arr = new double[3];
    System.out.println(arr);
    double temp = arr[from];
    arr[from]=arr[to];
    arr[to] = temp;
    System.out.println(arr[0]+ " "+arr[1]);
  }
  
}
