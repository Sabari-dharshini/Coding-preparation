import java.util.Scanner;
public class vending{
          public static void main(String[]args){
              Scanner sc=new Scanner(System.in);
               String[][] menu = {
            
            {"Espresso Coffee", "Cappuccino Coffee", "Latte Coffee"},
            
            {"Plain Tea", "Assam Tea", "Ginger Tea", "Cardamom Tea", "Masala Tea", 
             "Lemon Tea", "Green Tea", "Organic Darjeeling Tea"},
            
            {"Hot and Sour Soup", "Veg Corn Soup", "Tomato Soup", "Spicy Tomato Soup"},
            
            {"Hot Chocolate Drink", "Badam Drink", "Badam-Pista Drink"}
        };
        char mainchoice=sc.next().toLowerCase().charAt(0);
        int subchoice=sc.nextInt();
          int mainindex=-1;
 switch(mainchoice){
     case 'c':
         mainindex=0;
         break;
      case 't':
          mainindex=1;
          break;
      case 's':
          mainindex=2;
          break;
      case 'd':
          mainindex=3;
          break;
      default:
          mainindex=-1;
}
if (mainindex == -1 || subchoice < 1 || subchoice > menu[mainindex].length) {
            System.out.println("INVALID INPUT");
        } else {
            System.out.println("Welcome to CCD!");
            System.out.println("Enjoy your " + menu[mainindex][subchoice - 1] + "!");
}
}
}

                