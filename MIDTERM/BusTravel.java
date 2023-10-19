import java.util.Scanner;
public class BusTravel{
   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      int routeChoice;
      double speed = 0, distance = 0, arrivalTime = 0;
      
      System.out.println("Welcome to South Bus Terminal");
      System.out.println("You are in Cebu City");
      System.out.println("You are now in Minglanilla");
      System.out.println("You are now in San Fernando");
      System.out.println("You have have reached Carcar City");
      System.out.println("What route do you want to take?(Enter route number)");
      System.out.println("[1]Barili\n[2]Sibonga");
      System.out.print("Enter choice: ");
      routeChoice = scan.nextInt();
         switch(routeChoice){
            case 1:
               System.out.println("You have chosen the barili route");
               System.out.println("You are now in Dumanjug");
               System.out.println("You are now in Alcantatra");
               System.out.println("You have reached your destination in MoalBoal\n");
               System.out.println("How fast are you going in km/hr: ");
               speed = scan.nextDouble();
               distance = 84.9;
               arrivalTime = distance/speed;
               int temp = (int)(arrivalTime* 100);
               int hour = temp/100;
               int min = temp % 100;
               if(min >=60){
                  hour++;
                  min = min-60;
               }
               System.out.println("You speed is "+ speed+ "km");
               System.out.println("Your distance travelled is "+ distance + "km");
               
               System.out.printf("ETA: %d hour and %d minutes", hour,min+1);
              
           
               break;
            
            case 2:
               int choice;
               System.out.println("You have chosen the Sibonga route");
               System.out.println("What route do you want to take?(Enter route number)");
               System.out.println("[1]Dumanjug\n[2]Argao");
               System.out.print("Enter choice: ");
               choice = scan.nextInt();
               if(choice == 1){
                  System.out.println("You have chosen the Dumanjug route");
                  System.out.println("You are now in Alcantara");
                  System.out.println("You have reached your destination in MoalBoal");
                  System.out.println("How fast are you going in km/hr: ");
                  speed = scan.nextDouble();
                  distance = 96.2;
                  arrivalTime = distance/speed;
                  int temp1 = (int)(arrivalTime* 100);
                  int hour1 = temp1/100;
                  int min1 = temp1 % 100;
                  if(min1 >=60){
                     hour1++;
                     min1 = min1-60;
                  }
                  System.out.println("You speed is "+ speed+ "km");
                  System.out.println("Your distance travelled is "+ distance + "km");
                  System.out.printf("ETA: %d hour and %d minutes", hour1,min1+1);
                     
               
               }
               if(choice == 2){
                  System.out.println("You have chosen the Argao route");
                  System.out.println("You are now in ronda");
                  System.out.println("You are now in Alcantara");
                  System.out.println("You have reached your destination in MoalBoal");
                  System.out.println("How fast are you going in km/hr: ");
                  speed = scan.nextDouble();
                  distance = 126.7;
                  arrivalTime = distance/speed;
                  int temp2 = (int)(arrivalTime* 100);
                  int hour2 = temp2/100;
                  int min2 = temp2 % 100;
                  if(min2 >=60){
                     hour2++;
                     min2 = min2-60;
                  }
                  System.out.println("You speed is "+ speed+ "km");
                  System.out.println("Your distance travelled is "+ distance + "km");
                  System.out.printf("ETA: %d hour and %d minutes", hour2,min2+1);
                   
               }               
               break;       
        }
   }
}
