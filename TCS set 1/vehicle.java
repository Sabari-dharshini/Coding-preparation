/*
import java.util.Scanner;
public class rotateright{
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int []arr=new int[n];
    for(int i=0;i<n;i++){
         arr[i]=sc.nextInt();
        }
      int k=sc.nextInt();
        k=k%n;
      for(int r=0;r<k;r++){
         int last=arr[n-1];
       for(int i=n-1;i>0;i--){
          arr[i]=arr[i-1];
        }
        arr[0]=last;
}
for(int num:arr){
 System.out.println(num+" ");
}
}
}
*/



import java.util.Scanner;
public class vehicle{
public static void main(String[]args){
      Scanner sc=new Scanner(System.in);
     

       int T=sc.nextInt();
     for(int i=0;i<T;i++){
         int v=sc.nextInt();
      int w=sc.nextInt();

           if(w<2*v||w>4*v||w%2!=0){
           System.out.println("INVALID INPUT");
           continue;
           }
 int x=(4*v-w/2);
 int y=v-x;
if(x>=0 && y>=0){
    System.out.println(x+" "+y);
}else{
System.out.println(-1);
}
}
}
}
      
       