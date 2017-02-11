/**
 * Auto Generated Java Class.
 */
public class BMICalculatorRay {
  
  public static void main(String[] args){
    double h;
    int h1;
    int h2;
    double w;
    double bmi;
    
    //compute BMI
    h1 = 5;
    h2 = 8;
    h = h1*12 + h2;
    w = 100;
    bmi = w / (h * h) * 703;
    
    //print person 1
    System.out.println("A healthy BMI ranges between 19 and 25.");
    System.out.println("Person 1 has a weight of "+ w + "lbs and a height of "+h1+"'"+h2+"\". The BMI of person 1 is "+ bmi+".");
    
    //recompute BMI for person 2
     h1 = 5;
    h2 = 7;
    h = h1*12 + h2;
    w = 200;
    bmi = w / (h * h) * 703;
    
    //report person 2
    System.out.println("Person 2 has a weight of "+ w + "lbs and a height of "+h1+"'"+h2+"\". The BMI of person 2 is "+ bmi+".");
  }
    
  
}
