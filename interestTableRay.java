/**
 * Auto Generated Java Class.
 */
//to get the rounding format function, import java.text.*
import java.text.*;
//my class
public class interestTableRay {
  //my main, ONLY EDIT THIS PART
  public static void main(String[] args){
    //use the format: interestTable(Initial Amount, Number of Years, Interest Rate [in percent without percent sign], deposit per year);
    interestTable(1000, 25, 6.5, 100);
 
}
  //my static method, DO NOT EDIT, if you do not know what you are doing
  public static void interestTable(double initial, int years, double interest, int deposit){
    //sets the decimal format to two decimal places. Source: http://goo.gl/zx84Pk
    DecimalFormat df = new DecimalFormat("#.00");
    System.out.println("Year\tMoney");
    System.out.println("1\t$"+df.format(initial));
    double inter = 1 + interest/100;
    for (int i=1; i < years; i++){
     
      initial = initial*inter;
      double remain = initial%1/100;
      initial= initial-remain;
      initial = initial + deposit;
      System.out.println(i+1+"\t$"+df.format(initial));
      
    }
  }
}
    