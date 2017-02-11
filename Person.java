import java.util.*;
public class Person{
  /*Write a family database program. Create a class to represent a person and to store references to the person's mother,
  father, and any children the person has. Read a file of names to initialize the name and parent-child relationships of
  each Person. (You might wish to create a file representing your own family tree.) Store the overall list of Persons as
  an ArrayList. Write an overall main user interface that asks for a name and prints the maternal and paternal family
  line for that person */
  private Person mother;
  private Person father;
  private String name;
  private ArrayList<Person> children;
  public Person(String name){
    mother = null;
    father = null;
    children= new ArrayList<Person>();
    this.name = name;
  }
  public Person(Person mother, Person father, String name){
    children= new ArrayList<Person>();
    this.mother=mother;
    this.father=father;
    this.name = name;
  }
  public void addChild(Person child){
    children.add(child);
  }
  public void setMother(Person name){
    this.mother = name;
  }
  public void setFather(Person name){
    this.father =name;
  }
  public void getParents(){
    if(mother==null&&father==null){
      System.out.println(this.name);
    }else if(mother==null){
      System.out.println(this.name);
      System.out.print("Father: ");
      this.father.getParents();
    }else if(father==null){
      System.out.println(this.name);
      System.out.print("Mother: ");
      this.mother.getParents();
    }else{
      System.out.println(this.name);
      System.out.print("Mother: ");
      this.mother.getParents();
      System.out.print("Father: ");
      this.father.getParents();
    }
  }
  public void getMaternal(){
    System.out.print("Child's Name: ");
    System.out.println(this.name);
    
    if(this.mother==null){
      System.out.println("No Mother");
    }else{
      System.out.print("Mother: ");
      this.mother.getParents();
    }
  }
  public void getPaternal(){
    System.out.print("Child's Name: ");
    System.out.println(this.name);
    
    if(this.father==null){
      System.out.println("No Father");
    }else{
      System.out.print("Father: ");
      this.father.getParents();
    }
  }
  public Person getMother(){
    return mother;
  }
  public String getName(){
    return this.name;
  }
}