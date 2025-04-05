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