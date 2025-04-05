import java.util.Scanner;
public class Factorial {
     public static void main(String[]args){
     Scanner sc=new Scanner(System.in);
     int N=sc.nextInt();
     int fact=1;
     for(int i=2;i<=N;i++){
        int temp=0;
      for(int j=0;j<i;j++){
         temp+=fact;
       }
    fact=temp;
}
System.out.println(fact);
}
}
     