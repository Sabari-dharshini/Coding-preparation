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
/*
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
*/


import java.util.Scanner;
public class party {
public static void main(String[]args){
  Scanner sc=new Scanner(System.in);
  int T=sc.nextInt();
 
  int []E=new int[5];
  int []L=new int[5];
  
  int i;
  int j;
  for(i=0;i<E.length;i++){
       E[i]=sc.nextInt();
        }
  for(j=0;j<L.length;j++){
       L[j]=sc.nextInt();
   }
 int currentguest=0;
 int maxguest=0;
 for(int t=0;t<T;t++){
       currentguest+=E[t]-L[t];
    if(currentguest>maxguest){
        maxguest=currentguest;
        }
}

System.out.println(maxguest);
}
}
     
         