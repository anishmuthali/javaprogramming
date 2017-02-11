/**
 * Auto Generated Java Class.
 */
public class MeaningfulRay {
  
  public static void main(String args[]){
    //use meaningful("NAME");
    meaningful("Ms. Visa");
  }
  //the method is named meaningful
  public static void meaningful(String s){
    //find out length of name
    int l = s.length();
    //find out the length of your letters in the middle
    int y= l-2;
    //finds first Letter of Name
    String first = s.substring(0,1);
    //finds last letter of Name
    String last = s.substring(l-1,l);
    //Print statements
    System.out.println("Hello, " + s+ ", I am PAMA. I was made to be useful.");
    System.out.println("Your name has " + l + " letters. Isn't that amazing?");
    System.out.println("Another interesting fact is that "+s + " starts with "+first+ " and ends with "+ last + ".");
    System.out.println("Finally, your name has " + y + " letters between " + first + " and "+last+".");
    System.out.println("I hope you found my services useful. Once again, my name is PAMA. Goodbye, "+s+", and thank you for using me today.");
  }
  
}
