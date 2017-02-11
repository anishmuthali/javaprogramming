/**
 * Hi Ms. Visa!!!
 * 
 * I have first made it for five, then modified to twelve.
 * After that, I decided to make it able to change according to the number provided.
 * If you want, feel free to change the "n" variable, it changes the output!
 * 
 * From,
 * Ray
 */
public class nestedForLoopRay {
  
  public static void main(String[] args){
    int n=100;
    for (int i=1; i <=n; i++){
      
      for (int k=n-1; k >=i; k--){
        System.out.print(".");
      }
      
      System.out.print(i);
      for (int l=1; l <=i-1; l++){
        System.out.print(".");
      }
      System.out.println();
      
      
      
      
    }
    
  }
  
}
