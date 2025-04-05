/*
import java.util.Scanner;
public class palindrome{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int rev=0;
int temp=n;
while(n>0){
int digit=n%10;
rev=rev*10+digit;
n/=10;
}
if(temp==rev){
System.out.println("Palindrome");
}else{
System.out.println("Not a Palindrome");
}
}
}
*/
/*
import java.util.Scanner;
public class IncrementCalculation{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the salary");
double s=sc.nextDouble();
System.out.println("Enter the performance appraisal rating");
double a=sc.nextDouble();

if(s==0 || s<0 ||a>5 ||a<1){
 System.out.println("Invalid input");
}else{
double i=0.0;

if(a>=1 && a<=3){
   i=s*0.10;
   
}else if (a>=3.1 && a<=4){
   i=s*0.25;
   
}else if (a>=4.1 && a<=5){
    i=s*0.30;
  
}else{
System.out.println();
}
double ns=s+i;
if(ns==(int)ns){
System.out.println((int)ns);
}
else{
System.out.println(ns);
}
   }
}
}
*/

import java.util.Scanner;
public class courses {
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter no of course");
int n=sc.nextInt();
if(n<=0){
 System.out.println("Invalid range");
return;
}
sc.nextLine();

System.out.println("Enter course names");
String s[]=new String[n];
for(int i=0;i<n;i++){
   s[i]=sc.nextLine();
}
System.out.println("Enter the course to be selected");
String c=sc.nextLine();
boolean found = false;
        for (int i = 0; i < s.length; i++) {
            if (c.equals(s[i])) {
                found = true;
                break;
            }
        }
        
        if (found) {
            System.out.println(c + " course is available");
        } else {
            System.out.println(c + " course is not available");
        }
}
}


