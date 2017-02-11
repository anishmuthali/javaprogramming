import java.lang.Math;
import java.util.Scanner;

public class NumberGuessingRay{
  public static void main(String[] args){
    ComputerGuessNR();
  }
  public static void PersonGuess(){
    int randomNumber= (int) (Math.random() * (1000 - 1 +1)+1);
    Scanner scan = new Scanner(System.in);
    for (int i=0; i < 10; i++){
    System.out.println("Please guess a number");
    
    int input = scan.nextInt();
    if (input == randomNumber){
      System.out.println("You guessed the number");
      System.out.println("You tried "+i+" times");
      i = 10;
    }else{
      System.out.println("Wrong");
      System.out.println("");
    }
    
    }
    System.out.println("The right number is: " + randomNumber);
    System.out.println("You tried 10 times, but did not get it correct. Try again next time!");
  }
  public static void ComputerGuess(){
    int randomNumber= 0;
    Scanner scan = new Scanner(System.in);
    System.out.println("Think of a number 1 through 1000. I will guess it in 10 tries.");
    int max= 1000;
    int min= 1;
    for (int i=0; i < 10; i++){
     int randomNumber2= (int) (Math.random() * (max - min +1)+min);
     
    System.out.println("Is your number "+randomNumber2);
    
    String input = scan.nextLine();
    if (input.equals("Yes")||input.equals("yes")){
      System.out.println("Yay, I got it correct!");
      System.out.println("You tried "+i+" times");
      i=10;
    }else if (input.equals("higher")||input.equals("Higher")){
      min = randomNumber2;
    }else if (input.equals("lower")||input.equals("Lower")){
      max = randomNumber2;
    }
    
    }
    
    System.out.println("I tried 10 times, but did not get it correct. Let me try again!");
  }
  public static void ComputerGuessNR(){
    int randomNumber= 0;
    Scanner scan = new Scanner(System.in);
    System.out.println("Think of a number 1 through 1000. I will guess it in 10 tries.");
    System.out.println("If I am right, type yes. If I am wrong, tell me if the number is higher (h) or lower (l).");
    int max= 1000;
    int min= 1;
    int g=1;
    for (int i=1; i < 11; i++){
     
     int number2= (max+min)/2;
    System.out.println("Is your number "+number2);
    
    String input = scan.nextLine();
    if (input.equals("Yes")||input.equals("yes")||input.equals("y")){
      System.out.println("Yay, I got it correct!");
      System.out.println("You tried "+i+" times");
      break;
    }else if (input.equals("higher")||input.equals("Higher")||input.equals("h")){
      min = number2;
      g++;
    }else if (input.equals("lower")||input.equals("Lower")||input.equals("l")){
      max = number2;
      g++;
    }
    
    }
    if (g==11){
    System.out.println("I tried 10 times, but did not get it correct. Let me try again!");
    }
  }
}