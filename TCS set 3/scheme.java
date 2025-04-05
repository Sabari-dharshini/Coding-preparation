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