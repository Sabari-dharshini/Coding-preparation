/*
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
*/
import java.util.Scanner;
public class parking{
 public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
     int R=sc.nextInt();
     int C=sc.nextInt();
     int P[][]=new int[R][C];
     int maxcount=0;
     int maxindex=0;
     for(int i=0;i<R;i++){
           int count=1;
        for(int j=0;j<C;j++){
          P[i][j]=sc.nextInt();
            if(P[i][j]==1){
               count++;
        }
}
if(count>maxcount){
        maxcount=count;
        maxindex=i;
      }
}
System.out.println(maxindex+1);

}
}
     
         