import java.util.Scanner;

class Menu{

    public void getMenu(){
        System.out.println("C1 - Php 100.00 \nC2 - Php 150.00 \nC3 - Php 200.00 ");
    }
    
    public void getAddOns(){
        System.out.println("R1 - Php 35.00 \nR2 - Php50.00");
    }

    public double calculate(String order, int quantity){
        double total = 0;
        if(order.equals("C1")){
            total = 100 * quantity;
        }
        else if(order.equals("C2")){
            total = 150 * quantity;
        }
        else if(order.equals("C3")){
            total = 200 * quantity;
        }
        return total;
    }

    public double calculateAddOns( String order, int quantity){
        double total = 0;

        if(order.equals("R1")){
            total = 35 * quantity;
        }
        if(order.equals("R2")){
            total = 50 * quantity;
        }

        return total;
    }

    public double totalAmount(double x, double y){
        return x + y;
    }
    
    public double convertToDollar(double money){
      double dollar = 0;
         
         dollar = money/56.62;
         
      return dollar;
    }

}

public class RestaurantOrderingSystem {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Menu menu = new Menu();

        System.out.println("Welcome to our restaurant!!");
        boolean exit = false;

        while(!exit){
            String choice = "";
            int quantity;
            String addOnChoice;
            double x = 0, y = 0;
            System.out.println("Please select your choices");
            menu.getMenu();
            System.out.print("What do you want to order?: \n");
            choice = scan.nextLine().toUpperCase();
            System.out.print("How many orders do want? : ");
            quantity = scan.nextInt();
            scan.nextLine();
            x = menu.calculate(choice, quantity);
            System.out.println("Do you want some add ons?(Y if yes, N if no) ");
            addOnChoice = scan.nextLine().toUpperCase();
            if(addOnChoice.equals("Y")){
                menu.getAddOns();
                System.out.println("What do you want to add? ");
                String ch = scan.nextLine().toUpperCase();
                System.out.print("How many orders do you want to get: ");
                int addOnQuantity = scan.nextInt();
                scan.nextLine();
                y = menu.calculateAddOns(ch,addOnQuantity);
            }

            System.out.println("Your total amount in Php is Php"+ menu.totalAmount(x,y));
            System.out.printf("%s %.2f", "Your total amount in dollars is $",menu.convertToDollar(menu.totalAmount(x,y)));
            System.out.println("\nDo you want to make another order? (y if yes n if no)");
            String ex = scan.nextLine().toUpperCase();
            if(ex.equals("N")){
                exit = true;
            }
            else{
                exit = false;
            }
        }
        System.out.println("Thank you come again!");
    }
}
