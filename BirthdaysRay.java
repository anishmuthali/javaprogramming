import java.lang.Math;
import java.util.Scanner;
public class BirthdaysRay {
  
  public static void main(String[] args){
    birthdays();
  }
  public static void birthdays(){
    int month=1;
    int day=2; 
    int year=2008;
    System.out.println("This program compares two birthdays and displays which one is sooner. \nToday is "+month+"/"+day+"/"+year+", day #1 of the year.\n\n");
    System.out.println("Person 1:");
    System.out.print("What is your name?");
    Scanner scan2 = new Scanner(System.in);
    String input4 = scan2.nextLine();
    int r= person1();
    System.out.println("Person 2:");
    System.out.print("What is your name?");
    Scanner scan3 = new Scanner(System.in);
    String input5 = scan3.nextLine();
    int s= person2();
    if (r==s){
      System.out.println("Wow, you share the same birthday!");
    }else if (r>s){
      System.out.println("Wow!" +input4+"'s birthday is sooner!");
    }else if (s>r){
      System.out.println("Wow! "+input5+"'s birthday is sooner!");
    }
    System.out.println(getRandomResponse());
    System.out.println("\n");
  }
  public static int person1(){
  
  
    System.out.print("What month and day were you born?");
    Scanner scan = new Scanner(System.in);
    int input = scan.nextInt();
    int input2 = scan.nextInt();
    int abs1= absolute(input,input2);
    
    System.out.println(input +"/" + input2+"/2008 falls on day #"+abs1+" of 366");
    System.out.println("Your next birthday is in "+(abs1-2)+" day(s)");
    double per= (double) abs1*100/366;
    System.out.println("That is "+per+" percent of a year away.");
    return abs1;
  }
  public static int person2(){
 
    System.out.print("What month and day were you born?");
    Scanner scan1 = new Scanner(System.in);
    int input_1 = scan1.nextInt();
    int input2_1 = scan1.nextInt();
    int abs1_1= absolute(input_1,input2_1);
    
    System.out.println(input_1 +"/" + input2_1+"/2008 falls on day #"+abs1_1+" of 366");
    System.out.println("Your next birthday is in "+(abs1_1-2)+" day(s)");
    double per_1= (double) abs1_1*100/366;
    System.out.println("That is "+per_1+" percent of a year away.");
    return abs1_1;
  }
  public static int absolute(int x, int y){
    if (x==1){
      y= y+0;
    }else if (x==2){
      y=y+31;
    }else if (x==3){
      y=y+60;
    }else if (x==4){
      y=y+91;
    }else if (x==5){
      y=y+121;
    }else if (x==6){
      y=y+152;
    }else if (x==7){
      y=y+182;
    }else if (x==8){
      y=y+213;
    }else if (x==9){
      y=y+244;
    }else if (x==10){
      y=y+274;
    }else if (x==11){
      y=y+305;
    }else if (x==12){
      y=y+335;
    }
    return y;
  }
  public static String getRandomResponse()
 {
  final int NUMBER_OF_RESPONSES = 6;
  double r = Math.random();
  int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
  String response = "";
  
  if (whichResponse == 0)
  {
   response = "My birthday is the same day as national no school day. \nAn interesting fact: No schools that I have gone to actually celebrates this holiday.";
  }
  else if (whichResponse == 1)
  {
   response = "My birthday falls on Christmas. Unfortunately, I only get ONE present.";
  }
  else if (whichResponse == 2)
  {
   response = "My birthday is Columbus day. In fact, I'm Columbus.";
  }
  else if (whichResponse == 3)
  {
   response = "My birthday is on Halloween. For some reason, I always fall sick the day after my birthday. \n Could it be the candy? Nah, I don't think so!";
  }
    else if (whichResponse == 4)
  {
   response = "My birthday is NONE OF YOUR BUSINESS. Stop bothering me. Or else, I am telling the NSA YOUR birthday!";
  }
  else if (whichResponse == 5)
  {
   response = "I am a computer. I don't have a birthday. Fun Fact: I have no fun facts!";
  }

  return response;
 }
}
