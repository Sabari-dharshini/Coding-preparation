import java.util.Scanner;
public class nonrepeat{
 public static void main(String[]args){
       Scanner scan=new Scanner(System.in);
       int N=scan.nextInt();
       int a[]=new int[N];
       for(int i=0;i<N;i++){
           a[i]=scan.nextInt();
}
         
        int result=-1;
for(int i=0;i<a.length;i++){
     int count=0;
        for(int j=0;j<a.length;j++){
             
       if(a[i]==a[j]){
           count++;
}
}

if(count==1){
     result=a[i];
     break;
}
}
System.out.println(result);


       
}
}