import java.util.Scanner;
public class candies{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
      int N=10;
      int k=5;
      int b=sc.nextInt();
      int s=N-b;
      if(b>N){
         System.out.println("INVALID INPUT");
       }
      if(b<=N && b<=k){
          System.out.println("NUMBER OF CANDIES SOLD :"+b);
          System.out.println("NUMBER OF CANDIES LEFT :"+s);
         }
      
}
}