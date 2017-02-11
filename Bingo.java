import java.lang.Math;
import java.util.Scanner;
public class Bingo {
  
  public static void main(String args[]){
smallestLargest();

 }
  public static void smallestLargest(){
    System.out.print("How many numbers do you want to enter? ");
    Scanner scan = new Scanner(System.in);
    int input = scan.nextInt();
    System.out.print("Number 1:");
        int small=scan.nextInt();
        int large=small;
    for (int i=2; i<=input;i++){
        System.out.print("Number "+i+":");
        int input1=scan.nextInt();
        small= Math.min(input1, small);
        large=Math.max(input1, large);
        
    }
    System.out.println("Largest: "+large);
    System.out.println("Smallest: "+small);
}
  
}
