
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
       