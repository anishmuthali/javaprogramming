import java.io.*;
import java.util.*;
public class PersonRead {  
    private String file="";
    private FileReader fr;
    private ArrayList<Person> people;
   /* public static void main(String args[])throws Exception{    
          FileReader fr=new FileReader("tudor.dat");    
          BufferedReader br=new BufferedReader(fr);    
  
          br.close();    
          fr.close();    
    }*/
    public PersonRead(String file){
      this.file=file;
      System.out.print(this.file);
      people = new ArrayList<Person>();
    }
   public void load()throws Exception{    
      if(this.file==null){
          System.out.println("Hello");
      }else{
          fr=new FileReader(this.file);    
          BufferedReader br=new BufferedReader(fr);
          String person="";
          String mother="";
          String father="";
          person=br.readLine();

          while(!person.equals("END")){
          mother=br.readLine();
          father=br.readLine();
          Person current = new Person(person);
          people.add(current);
          System.out.println("added new person: "+person);
          if(mother.equals("unknown")){
          }else if(find(mother)==null){
              Person temp = new Person(mother);
              temp.addChild(current);
              current.setMother(find(mother));
              people.add(temp);
              System.out.println("added new mother: "+mother+" of "+person);
            }else {
              find(mother).addChild(current);
              current.setMother(find(mother));
              System.out.println("found mother: "+mother+" of "+person);
            }
            if(father.equals("unknown")){
            }else if(find(father)==null){
              Person temp = new Person(father);
              temp.addChild(current);
              current.setFather(find(father));
              people.add(temp);
              System.out.println("added new father: "+father+" of "+person);
            }else {
              find(father).addChild(current);
              current.setFather(find(father));
              System.out.println("found father: "+mother+" of "+person);
            } 
          person=br.readLine();
          }
          br.close();    
          fr.close();
          System.out.println("SUCCESS");
          
      }
    }
   public static void main(String args[])throws Exception{
         PersonRead nice = new PersonRead("tudor.dat");
    nice.load();
    //System.out.print(nice.find("Margaret Stuart"));
   }
   public Person find(String name){
     for(Person x: people){
       if(name==null){
       }
      else if(x.getName().equals(name)){
         return x;
       }
     }
     return null;
  }
}    