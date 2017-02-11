import java.lang.Math;
import java.util.*;
//mastermind
public class MastermindFinalSamishRay {
 
  /* ADD YOUR CODE HERE */
public static void main(String[] args){
       //runs the game
       mastermind();
     }
      
     public static void mastermind(){
       //instructions: Samish
       System.out.println("Welcome to the game of Mastermind. You will try to guess my number. \nI will tell you how many numbers are correctly in their place, and how many that are correctly guessed but not in the right place.\nGood Luck!");
       
      
         //make a random array of four ints: Samish
         int[] array = new int[4];
         
         int[] user = new int[4];
         int[] bull = new int[4];
         //add the ints to the array: Samish
         for (int i=0;i<4;i++){
              array[i]= (int) (Math.random() * (9 - 0 +1)+0);
         }
         //take in user 4 digit number: Samish
         Scanner scan = new Scanner(System.in);
         //select level: Samish
         System.out.println("Select a level. Type 0 for unlimited Guesses, otherwise, type the number of guesses you would like to use.");
         int level;
         level=scan.nextInt();
         int counttimes=0;
         System.out.println("Type Your Guess");
         int usernum = scan.nextInt();
         for (int i=3;i>=0;i--){
             user[i]=usernum%10;
             usernum=usernum/10;
         }
         //while the arrays do not match
          counttimes++;
         while (counttimes!=level&&array!= user){
           int counterplace=0;
           //check place: Samish
           for(int i = 0; i < 4; i++){
             if(array[i] == user[i]){
                     counterplace++;
                     bull[i]=1;
             }
           }
           //prints number of correct places: Samish
               System.out.println("You have "+counterplace +" numbers in the right place.");
               if(counterplace==4){
                 System.out.print("You guessed correctly! The number was ");
                 for(int i =0;i<4;i++){
                   System.out.print(array[i]);
                 }
                 break;
               }
               //prints number of correct numbers but incorrect place: Ray
               System.out.println("You have "+checkcorrect(array, user, bull)+" numbers correctly guessed but in the wrong place");
               counttimes++;
               if(level==0){
                 String gl="Unlimited";
                 System.out.println("Turn: "+(counttimes-1)+" Guesses left: "+gl);
               }else{
                 int gl = level-counttimes;
                 System.out.println("Turn: "+(counttimes-1)+" Guesses left: "+(gl+1));
               }
              
               System.out.print("Make another guess");
               
               usernum = scan.nextInt();
               for (int i=3;i>=0;i--){
             user[i]=usernum%10;
             usernum=usernum/10;
             
         }
               for(int n=0;n<4;n++){
                 bull[n]=0;
               }
              
               
         }
         //lose or win message: Ray
         if (counttimes==level&&Arrays.toString(array).equals(Arrays.toString(user))){
           System.out.print("You guessed correctly! The number was ");
                 for(int i =0;i<4;i++){
                   System.out.print(array[i]);
                 }
         }else if (counttimes==level){
         System.out.print("You Lose. The number was ");
         for(int i =0;i<4;i++){
                   System.out.print(array[i]);
                 }
         }
         
     }
         
                   
      //checks incorrect places: Ray
     public static int checkcorrect(int[] array, int[] user, int[] bull){
       int counter=0;
         for (int i=0; i<array.length; i++){
           if (bull[i]!=1){
             for (int j=0;j<user.length;j++){
               if (bull[j]!=1){
               if (array[i]==user[j]){
                     counter++;
               }}
             }
         }
         }
         return counter;
     }
 }