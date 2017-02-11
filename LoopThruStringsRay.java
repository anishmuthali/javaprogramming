/*This activity will help you get familiar with the String method substr and how it is used in a for loop. 

In a file called LoopThruStrings<YourName>, write three methods that loop through a String. 
The first method accepts a String as parameter and prints every letter of the input parameter on a different line. 
The second method accepts a String as parameter and prints every other letter of the input parameter on a different line. 
The third method accepts a String as parameter and prints the String in reverse order.*/
public class LoopThruStringsRay {
  
  public static void main(String args[]){
    stringDifferentLine("Hello");//Prints one Every Line
    stringEODifferentline("Hello"); //ODD
    stringEODifferentline("Hello Ms Visa!"); //EVEN
    stringReverse("Hello");//Reverse
    
  }
  public static void stringDifferentLine(String s){
    int x = 0;
    int y = 1;
    for(int i = 1; i<= s.length(); i++){
      System.out.println(s.substring(x, y));
      x= x+1;
      y= y+1;
    }
    
  }
  public static void stringEODifferentline(String s){
    int x = 0;
    int y = 1;
    //if even number of length
    for(int j = s.length()%2; j == 0; j--){
      for(int i = 1; i<= s.length()/2; i++){
        System.out.print(s.substring(x,y));
        System.out.println(s.substring(x+1, y+1));
        x= x+2;
        y= y+2;
      }
    }
    //if odd number of length
    for(int j = s.length()%2; j == 1; j--){
      for(int i = 1; i<= s.length()/2; i++){
        System.out.print(s.substring(x,y));
        System.out.println(s.substring(x+1, y+1));
        x= x+2;
        y= y+2;
      }
      System.out.print(s.substring(s.length()-1,s.length()));
    }
    System.out.println();
  }
  public static void stringReverse(String s){
    int x= s.length()-1;
    int y= s.length();
    for(int i= s.length(); i>= 1; i--){
      System.out.print(s.substring(x,y));
      x--;
      y--;
    }
  }
}
