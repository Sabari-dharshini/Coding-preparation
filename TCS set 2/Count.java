import java.util.Scanner;
class GCD{
public static void main(String[]args)
{
Scanner scan=new Scanner(System.in);
int a=scan.nextInt();
int b=scan.nextInt();

while(b!=0){
int temp=b;
b=a%b;
a=temp;

}
System.out.println("GCD of two numbers : "+a);
}
}
