import java.util.*;
import java.io.*;
public class PersonClient{
  private PersonRead nice;
  public static void main(String args[])throws Exception{
    /*Person john = new Person("John");
    Person elizabeth = new Person("Elizabeth");
    Person jack = new Person("Jack");
    Person molly = new Person(elizabeth, john, "Molly");
    Person sam = new Person(molly, jack, "Sam");*/
    System.out.println("Loading Database. Please stand by!");
    PersonRead nice = new PersonRead("tudor.dat");
    nice.load();
    menu(nice);
  }
  public static void menu(PersonRead nice){
    Scanner scan =new Scanner(System.in);
    String x="";
    System.out.println("Welcome to the Tudor Family Database. Choose one of the following options below. Type \"quit\" when you want to quit.");
      System.out.println("Choose one of the following options:");
      System.out.println("Type \"getParents\" to get the parent lines of a person. Type \"getName\" to search up a person if he exists in the database.");
      System.out.println("Type \"addPerson\" to add new people to the database (Coming soon) and type \"reload\" to refresh the database file (Coming Soon).");
    while(!x.equals("quit")){
      x=scan.nextLine();
      if(x.equals("getParents")){
        getParents(nice);
      }else if(x.equals("getName")){
        getName(nice);
      }else if(x.equals("addPerson")||x.equals("reload")){
        System.out.println("Not available yet!. Type \"help\" to see available options.");
      }else if(x.equals("help")){
        help();
      }else if(x.equals("quit")){
        System.out.println("Ok... Quitting...");
        System.out.println("Thanks for using the Tudor Family Database Client!");
      }else{
        System.out.println("Not an option. Type \"help\" to see available options.");
      }
    }
  }
  public static void getParents(PersonRead nice){
    Scanner scan =new Scanner(System.in);
    String x="";

    while(!x.equals("back")){
      System.out.println("Type a name to get either their maternal or paternal family line. Type \"back\" to go back.");
      x=scan.nextLine();
      String name = x;
      if (x.equals("back")){
        break;
      }
      System.out.println("To search maternal, type \"m\". To search paternal, type \"p\". Type \"back\" to go back.");
      x=scan.nextLine();
      if(nice.find(name)==null){
        System.out.println("Not a vaild name!");
      }
      else if(x.equals("m")){
        nice.find(name).getMaternal();
      }else if(x.equals("p")){
        nice.find(name).getPaternal();
      }else if(x.equals("back")){
        break;
      }else{
        System.out.println("Not a valid option. To search maternal, type \"m\". To search paternal, type \"p\". Type \"back\" to go back.");
      }
    }
    help();
  }
  public static void help(){
    System.out.println("Welcome to the Tudor Family Database. Choose one of the following options below. Type \"quit\" when you want to quit.");
      System.out.println("Choose one of the following options:");
      System.out.println("Type \"getParents\" to get the parent lines of a person. Type \"getName\" to search up a person if he exists in the database.");
      System.out.println("Type \"addPerson\" to add new people to the database (Coming soon) and type \"reload\" to refresh the database file (Coming Soon).");
  }
  public static void getName(PersonRead nice){
    help();
  }
}