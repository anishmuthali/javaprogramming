import java.io.*;
public class LengthTest{

   public static void main(String args[]) {
      String Str1 = new String("Samish is cool");
      String Str2 = new String("This one has PUNCTUATION!?!?!" );
      String Str3 = new String("THIS ONE HAS #Õs. 123456789" );

      System.out.print("String Length :" );
      System.out.println(Str1.length());

      System.out.print("String Length :" );
      System.out.println(Str2.length());
      System.out.print("String Length :" );
      System.out.println(Str3.length());
   }
}

