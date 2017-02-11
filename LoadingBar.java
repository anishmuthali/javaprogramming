/**
 * Simulation of a loading bar
 */
public class LoadingBar {
  
  public static void main(String[] args){
    //feel free to change the integer value ;-)
    int n=100;
    for (int i=1; i <=n; i++){
      //prints the dots before the number
      for (int l=1; l <=i-1; l++){
        System.out.print(".");
      }
      //print number + percent sign
      System.out.print(i+"%");
      //prints the dots after the number
      for (int k=n-1; k >=i; k--){
        System.out.print(".");
      }
      //prints a space
      System.out.println();
      
      
      
      
    }
    
  }
  
}
