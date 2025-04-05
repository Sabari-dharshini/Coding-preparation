/*
import java.util.Scanner;
public class scheme{
public static void main(String []args){
Scanner sc=new Scanner(System.in);
final int SchemeAmount = 5000;
String p=sc.nextLine();
String hc=sc.nextLine();
int totalMembers = 1;
int parentCommission = 0;
String[] childNames = new String[0];
if (hc.equalsIgnoreCase("Y")) {
            String childrenInput = sc.nextLine().trim();
            childNames = childrenInput.split(",");
            totalMembers += childNames.length;
 parentCommission = 500 * childNames.length;
 for (String name : childNames) {
                name = name.trim();
            }
        } else {
           
            parentCommission = 250;
        }
        
        
        System.out.println("TOTAL MEMBERS:" + totalMembers);
        System.out.println("COMISSION DETAILS");
        System.out.println(p + ": " + parentCommission + " INR");
        
        if (hc.equalsIgnoreCase("Y")) {
            for (String child : childNames) {
                System.out.println(child.trim() + ": 250 INR");
            }
        }
}
}
*/
import java.util.Scanner;
class Func {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        checkNumber(num);
    }
   public static void checkPrime(int n) {  
        boolean flag = true;
        
        if (n <= 1) {  
            flag = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {  
                if (n % i == 0) {
                    flag = false;
                    break;
                }
            }
        }
        
        if (flag) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not a prime");
        }
    }
    
    public static void checkNumber(int n) {  
        if (n < 0) {
            System.out.println("Please enter a positive number");
        } else {
            checkPrime(n);
        }
    }
}
    
