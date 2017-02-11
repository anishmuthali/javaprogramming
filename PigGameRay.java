/**
 * Auto Generated Java Class.
 */
import java.lang.Math;
import java.util.Scanner;
public class PigGameRay {
  //Ms. Visa---- How my random works
  //First My random limits the maximum time the computer can roll, which is 10
  //Everytime it goes through the loop, the computer will minus 1
  //It will roll a dice, first time through with 1/10 chance of stopping, second time 1/9, third time 1/8, and so on
  //eventually, after 10 rounds, it will be a 1/1 chance of stopping.
  //I played with computer with the random stopping, i usually win
  //but with unrandom, the computer has a high chance of winning
  //finally, I improved pig to how i usually play it, with two dice. 
  //if I get only one die with 1, that turn's points are gone
  //if both dice show 1, your whole score is gone, returning your score to zero
  //the goal is the same, to get to 100 points
  //the two die game has the AI system shown above built in
  //please definitely play by running pigtwo();
  
  //have fun!
  public static void main(String[] args){
    //run pig completelyrandom
    pigtwo();
    //run pig not random (AI Mode)
    //Uncomment this: pigunrand();
    //run pig 2 dice
    //Uncomment this: pigtwo();
    
  }
  
  public static void pig(){
    int comp= 0;
    int person=0;
    int tempcomp=0;
    int tempperson=0;
    int stop= 0;
    int stopperson=0;
    int randomNumber= (int) (Math.random() * (6 - 1 +1)+1);
    Scanner scan = new Scanner(System.in);
    while (comp<100&&person<100){
      
      while (stop!=1){
        randomNumber= (int) (Math.random() * (6 - 1 +1)+1);
        System.out.println("Computer 2 Roll:" +randomNumber);
        if (randomNumber==1){
          tempcomp=0;
          stop=1;
        }else{
        stop= (int) (Math.random() * (2 - 1 +1)+1);
        tempcomp=tempcomp+randomNumber;
        
        }
                           }
      stop=0;
      comp=comp+tempcomp;
      tempcomp=0;
      if(comp>100){
        break;
      }
      System.out.println("Current Computer Score: "+comp);
      System.out.println("Current Person Score: "+person);
      while (stopperson!=1){
        randomNumber= (int) (Math.random() * (6 - 1 +1)+1);
        System.out.println("Person Roll:" +randomNumber);
        if (randomNumber==1){
          tempperson=0;
          stopperson=1;
        }else{
        tempperson=tempperson+randomNumber;
        System.out.print("Enter a Number(2 to roll, 1 to quit):");
        stopperson = scan.nextInt();
        }
      }
      stopperson=0;
      person=person+tempperson;
      tempperson=0;
      System.out.println("Current Computer Score: "+comp);
      System.out.println("Current Person Score: "+person);
    }
    if (person>100&&comp>100){
      System.out.println("Tie Game!");
    }else if(comp>100){
      System.out.println("Computer Won! Computer got "+comp);
    }else if(person>100){
      System.out.println("Player Won! Player got "+person);
    }
  }
  
    public static void pigunrand(){
    int comp= 0;
    int person=0;
    int tempcomp=0;
    int tempperson=0;
    int stop= 0;
    int stopperson=0;
    int randomNumber= (int) (Math.random() * (6 - 1 +1)+1);
    int compcounter=10;
    Scanner scan = new Scanner(System.in);
    while (comp<100&&person<100){
      
      while (stop!=1){
        randomNumber= (int) (Math.random() * (6 - 1 +1)+1);
        System.out.println("Computer 2 Roll:" +randomNumber);
        if (randomNumber==1){
          tempcomp=0;
          stop=1;
        }else{
        stop= (int) (Math.random() * (compcounter - 1 +1)+1);
        tempcomp=tempcomp+randomNumber;
        
        }
        
      }
      stop=0;
      comp=comp+tempcomp;
      tempcomp=0;
      compcounter=10;
      
      if(comp>100){
        break;
      }
      System.out.println("Current Computer Score: "+comp);
      System.out.println("Current Person Score: "+person);
      while (stopperson!=1){
        randomNumber= (int) (Math.random() * (6 - 1 +1)+1);
        System.out.println("Person Roll:" +randomNumber);
        if (randomNumber==1){
          tempperson=0;
          stopperson=1;
        }else{
        tempperson=tempperson+randomNumber;
        System.out.print("Enter a Number(2 to roll, 1 to quit):");
        stopperson = scan.nextInt();
        }
      }
      stopperson=0;
      person=person+tempperson;
      tempperson=0;
      System.out.println("Current Computer Score: "+comp);
      System.out.println("Current Person Score: "+person);
    }
    if (person>100&&comp>100){
      System.out.println("Tie Game!");
    }else if(comp>100){
      System.out.println("Computer Won! Computer got "+comp);
    }else if(person>100){
      System.out.println("Player Won! Player got "+person);
    }
  }
      public static void pigtwo(){
    int comp= 0;
    int person=0;
    int tempcomp=0;
    int tempperson=0;
    int stop= 0;
    int stopperson=0;
    int dice1= (int) (Math.random() * (6 - 1 +1)+1);
    int dice2= (int) (Math.random() * (6 - 1 +1)+1);
    int compcounter=10;
    Scanner scan = new Scanner(System.in);
    while (comp<100&&person<100){
      
      while (stop!=1){
        dice1= (int) (Math.random() * (6 - 1 +1)+1);
        dice2= (int) (Math.random() * (6 - 1 +1)+1);
        System.out.println("Computer 2 Roll:" +dice1+" "+dice2);
        if(dice1==1&&dice2==1){
          comp=0;
          tempcomp=0;
          stop=1;
        }else if (dice1==1||dice2==1){
          tempcomp=0;
          stop=1;
        }else{
        stop= (int) (Math.random() * (compcounter - 1 +1)+1);
        tempcomp=tempcomp+dice1+dice2;
        compcounter--;
        
        }
                           }
      stop=0;
      comp=comp+tempcomp;
      tempcomp=0;
      compcounter=10;
      if(comp>100){
        break;
      }
      System.out.println("Current Computer Score: "+comp);
      System.out.println("Current Person Score: "+person);
      while (stopperson!=1){
        dice1= (int) (Math.random() * (6 - 1 +1)+1);
        System.out.println("Person Roll:" +dice1+" "+dice2);
        if(dice1==1&&dice2==1){
          person=0;
          tempperson=0;
          stop=1;
        }else if (dice1==1||dice2==1){
          tempperson=0;
          stopperson=1;
        }else{
        tempperson=tempperson+dice1+dice2;
        System.out.print("Enter a Number(2 to roll, 1 to quit):");
        stopperson = scan.nextInt();
        }
      }
      stopperson=0;
      person=person+tempperson;
      tempperson=0;
      System.out.println("Current Computer Score: "+comp);
      System.out.println("Current Person Score: "+person);
    }
    if (person>=100&&comp>=100){
      System.out.println("Tie Game!");
    }else if(comp>=100){
      System.out.println("Computer Won! Computer got "+comp);
    }else if(person>=100){
      System.out.println("Player Won! Player got "+person);
    }
  }
  
}
