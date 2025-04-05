/*
import java.util.Scanner;
public class fuel{
   public static void main(String[]args){
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of litres to fill the tank");
         float f=sc.nextFloat();
        if(f<=0){
System.out.println("INVALID INPUT");
return;
}
        System.out.println("Enter the distance covered");

         int d=sc.nextInt();
     if(d<=0){
            System.out.println("INVALID INPUT");
return;
            

}else{
        float result=(f/d)*100;
        System.out.println("Litres/100KM");
          System.out.println(String.format("%.2f", result));

        double d1=d*0.6214;
        double f1=f*0.2642;
         double result1=d1/f1;
        System.out.println("Miles/Gallons");
         System.out.println(String.format("%.2f", result1));
}

}
}
*/

import java.util.Scanner;
public class theatre{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter no of pizzas bought : ");
int p=sc.nextInt();
System.out.print("Enter no of puffs bought : ");
int f=sc.nextInt();
System.out.print("Enter no of cooldrinks bought : ");
int c=sc.nextInt();
int pp=100;
int fp=20;
int cp=10;
int tp=(p*pp)+(f*fp)+(c*cp);

System.out.println("BILL DETAILS");
System.out.println("No of pizzas : "+p);
System.out.println("No of puffs : "+f);
System.out.println("No of cooldrinks : "+c);
System.out.println("Total price : "+tp);
System.out.println("ENJOY THE SHOW !!!");

    
}
}
 