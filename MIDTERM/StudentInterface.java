import java.util.Scanner;
class Student{

   private String first_name, middle_name,last_name, suffix;
   
   public String getFirstName(){
      return first_name;
   }
   public String getMiddleName(){
      return middle_name;
   }
   public String getLastName(){
      return last_name;
   }
   public String getSuffix(){
      return suffix;
   }
   public String getFullName(){
      return getFirstName()+" "+ getMiddleName()+ " "+ getLastName();
   }
   
   public void setFirstName(String first_name){
      this.first_name = first_name;
   }
   public void setMiddleName(String middle_name){
      this.middle_name = middle_name;
   }
   public void setLastName(String last_name){
      this.last_name = last_name;
   }
   public void setSuffix(String suffix){
      this.suffix = suffix;
   }
   public void Display(){
      System.out.println("First name:" + getFirstName());
      System.out.println("Middle name:" + getMiddleName());
      System.out.println("Last Name: "+ getLastName());
      if(suffix != null){
         System.out.println("Suffix: " + getSuffix());
      }
   }
}  

public class StudentInterface{
   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      Student stud = new Student();
      String first_name = scan.nextLine();
      String middle_name = scan.nextLine();
      String last_name = scan.nextLine();
      String suffix = scan.nextLine();
      scan.close();
      
      stud.setFirstName(first_name);
      stud.setMiddleName(middle_name);
      stud.setLastName(last_name);
      stud.setSuffix(suffix);
      
      stud.Display();
      
      System.out.println(stud.getFirstName() + " "+ stud.getMiddleName()+ " "+  stud.getLastName()+ " " + stud.getSuffix());
     
      
      
   }
}