import java.util.Scanner;
public class Good  {
     public static void main(String[]args){
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int sum=0;
     int temp=n;
     while(n>0){
        int digit=n%10;
        sum+=digit;
        n/=10;
         }
      if(temp%sum==0){
          System.out.println("Good number");
        }else{
           System.out.println("Bad number");
     }

}
}
     