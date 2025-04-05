/*
import java.util.Scanner;
public class FOE {
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
 System.out.print("Enter no of students placed in CSE : ");
 int cse=sc.nextInt();
 System.out.print("Enter no of students placed in ECE : ");
 int ece=sc.nextInt();
 System.out.print("Enter no of students placed in MECH : ");
 int mech=sc.nextInt();

if(cse<0||ece<0||mech<0){
   System.out.println("INPUT IS INVALID");
   
}else if(cse==ece && ece==mech){
   System.out.println("None of the department has got highest placements");
}else {
    int max = Math.max(cse, Math.max(ece, mech));
            System.out.println("Highest placement");

            if (cse == max) {
                System.out.println("CSE");
            }
            if (ece == max) {
                System.out.println("ECE");
            }
            if (mech == max) {
                System.out.println("MECH");
            }
        }

 }
}
*/
import java.util.Scanner;
public class theatreticket{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter the no of tickets : ");
int t=sc.nextInt();
if(t<5||t>40){
System.out.println("Minimum of 5 and Maximum of 40 tickets");
}else{
System.out.print("Do you want refreshments : ");
char c=sc.next().toLowerCase().charAt(0);

System.out.print("Do you have  coupon code : ");
char c1=sc.next().toLowerCase().charAt(0);
System.out.print("Enter the circle : ");
char c2=sc.next().toLowerCase().charAt(0);
double tc=0;

 if (c2 == 'k') {
            tc = 75;
        } else if (c2 == 'q') {
            tc= 150;
        } else {
            System.out.println("Invalid Input");
            return;
        }

double totalCost=tc*t;
 if (t > 20) {
            totalCost -= totalCost * 0.10;
        }
if (c1 == 'y') {
            totalCost -= totalCost * 0.02;
        }

if(c =='y'){
           totalCost+=50*t;
       }
System.out.printf("Ticket cost:%.2f\n", totalCost);
}
}
}
  
