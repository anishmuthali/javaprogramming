/* Prompt: AP CS Arrays Beginner Exercises

1. Accept n integers into an array of appropriate size and then print the array backwards. (5 pts)

2. Ask the user to enter the number of days; then enter that many temperatures. Next, find the

average of the temperatures and count how many days had above average temperatures. (10

pts)

3. Ask the user to enter Strings until the user types “done”. When done, count the length of each

String and store the lengths in a parallel array. Print the Strings the user entered along with the

corresponding lengths. Find the average length of Strings in the array. Report how many Strings

are above average length. (20 pts) */
//Note: I have added some comments along the code to explain my logic
//Note: all averages are counted with the INT, not with DOUBLE. It may lose precision
//Importing Math and Scanner (in case of Use)
import java.lang.Math;
import java.util.Scanner;
public class ArrayExercisesRay{
  public static void main(String[] args){
    /*The Three Methods are 
    backwards(); for the first prompt
    temp(); for the second prompt
    strcount(); for the third prompt
    */
    strcount();
  }
  public static void backwards(){
    //declare a variable times and declare the scanner
    int times;
    Scanner scan = new Scanner(System.in);
    //ask for how many integers will be entered
    System.out.println("Enter Number of Integers");
    times = scan.nextInt();
    //initialize the length of array based on number given
    int[] temps = new int[times];
    //as long as there is spaces to fill in the array, ask for a number
    for (int i=0;i<times;i++){
      System.out.println("Enter a Number "+(i+1));
      temps[i]=scan.nextInt();
    }
    //print array terms from the number given to zero
    for (int i=times-1;i>=0;i--){
      System.out.print(temps[i]+" ");
    }
  }
  public static void temp(){
    //declare a variable times and declare the scanner
    int times;
    Scanner scan = new Scanner(System.in);
    //ask for how many days will be entered
    System.out.println("Enter Number of Days");
    times = scan.nextInt();
    //create the array with number of days entered
    int[] temps = new int[times];
    //as long as there are spots in the array to fill, ask for a temperature
    for (int i=0;i<times;i++){
      System.out.println("Enter a Temperature "+(i+1));
      temps[i]=scan.nextInt();
    }
    int avg=0;
    //finds the average
    for (int i=0;i<times;i++){
      avg= avg+temps[i];
    }
    avg = avg/times;
    int count=0;
    //finds how many are above the average
    for (int i=0; i<times;i++){
      if(temps[i]>avg){
        count++;
      }
    }
    
    //print out info
    System.out.println("The Average Temperature is: "+avg);
    System.out.println("There are "+count+"days above average");
  }
  public static void strcount(){
    //initializes scanner
    Scanner scan = new Scanner(System.in);
    int count=0;
    //ask for first string
    System.out.print("Enter a string. If done with entering all strings, press type 'done':");
    String texture=scan.nextLine();
    String times= texture;
    //if the user types done (which is to quit), say that he didn't enter any strings
    if (times.equals("done")){
      System.out.println("No strings entered");
    }
    //otherwise...
    else{
      //while it is not done, take the string, make a long string + count how many times he typed in a string
    while(!(texture.equals("done"))){
      System.out.print("Enter a string. If done with entering all strings, press type 'done':");
      texture=scan.nextLine();
      //concaranate the old strings + the new string with "done" in the middle, because thats the way to differenciate strings 
      //without knowing how many the users have entered
      //This is like making a "pseudo" array (can explain this concept in class if needed) <- I made the word "pseudoarray" up
      times = times+"done"+texture;
      count++;
    }
    //make an array for strings and another for length of strings according to the number of inputs
    String[] strings = new String[count];
    int[] strlengths = new int[count];
    int temporary=0;
    //finds each string entered according to the index of "done"
    for(int i=0; i<count;i++){
      temporary=times.indexOf("done");
      strings[i]=times.substring(0,temporary);
      strlengths[i]=times.substring(0,temporary).length();
      times=times.substring(temporary+4);
    }
    //prints each string with the corresponding string lengths
    for(int j=0;j<count;j++){
      System.out.println("String "+(j+1)+": "+strings[j]+" Length: "+strlengths[j]);
    }
    int avg=0;
    //finds average
    for(int k=0; k<count;k++){
      avg=avg+strlengths[k];
    }
    avg=avg/count;
    //finds number of strings with lengths above
    int above=0;
    for(int l=0; l<count;l++){
      if(strlengths[l]>avg){
        above++;
      }
    }
    //prints average and above information
    System.out.println("The average length of strings is "+avg+". There is/are "+above+" string(s) above the average");
  }
  }
}