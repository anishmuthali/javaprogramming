/**
 * Auto Generated Java Class.
 */
public class BMICalculatorRay {
  
  public static void main(String[] args){
    double h;
    double w;
    double bmi;
    
    //compute BMI
    h1 = 5;
    h2 = 3;
    h = h1*12 + h2;
    w = 125;
    bmi = w / (h * h) * 703;
    
    //print results
    System.out.println("A healthy BMI ranges between 19 and 25.");
    System.out.println("Person 1 has a weight of"+ w + "lbs and a height of"+h1"'"+h2+"\". The BMI of person 1 is"+ bmi);
    
    //recompute BMI
     h1 = 5;
    h2 = 4;
    h = h1*12 + h2;
    w = 150;
    bmi = w / (h * h) * 703;
    
    //report new results
    System.out.println("Person 2 has a weight of"+ w + "lbs and a height of"+h1"'"+h2+"\". The BMI of person 2 is"+ bmi);
  }
    
  
}
