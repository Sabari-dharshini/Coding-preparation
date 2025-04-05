/*
import java.util.Scanner;
public class house{
    public static void main(String[]args){
          Scanner sc=new Scanner(System.in);
            int iwall=18;
            int ewall=12;
            int ni=sc.nextInt();
            int ei=sc.nextInt();
            double iarea=0.0;
            double earea=0.0;

            if(ni>0){
            for(int i=0;i<ni;i++){
                iarea+=sc.nextDouble();
               }
             }
               if(ei>0){
              for(int j=0;j<ei;j++){
                earea+=sc.nextDouble();
               }
             }

           double icost=iarea*18;
           double ecost=earea*12;
           double tcost=icost+ecost;
          System.out.println("Total estimated cost : "+tcost+ "INR");
}
}
*/
/*
import java.util.Scanner;
class cipher{
public static void main(String[]args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter your plain text : ");
      String text=sc.nextLine();
      System.out.println("Enter the key");
      int key=sc.nextInt();
      if(key<0){
         System.out.println("INVALID INPUT");
         }
       String result="";
       for(int i=0;i<text.length();i++){
         char c=text.charAt(i);
        if(c>='A'&&c<='Z'){
           result+=(char)('A'+(c-'A'+key)%26);
       }else if(c>='a'&&c<='z'){
           result+=(char)('a'+(c-'a'+key)%26);
}else if(c>='0'&&c<='9'){
          result+=(char)('0'+(c-'0'+key)%10);
}else{
       result+=c;
}
}

      System.out.println("The encrypted text : "+result);
}
}
*/
/*
import java.util.Scanner;
public class washing{
 public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
      int w=sc.nextInt();
    if(w<0||w>7000){
      System.out.println("INVALID INPUT");
 }else if(w==0){
      System.out.println("Time estimated : 0 minutes ");
}else if(w>0 && w<=2000){
      System.out.println("Time estimated : 25 minutes ");
}else if(w>2000 && w<=4000){
      System.out.println("Time estimated : 35 minutes ");
}else if(w>=4000 && w<=7000){
      System.out.println("Time estimated : 45 minutes ");
}else{
      System.out.println("OVERLOADED ");
}
}
}
*/


/*
import java.util.Scanner;
public class symmetric{
   public static void main(String[]args){
      Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][]arr=new int[n][2];
        for(int i=0;i<n;i++){
           arr[i][0]=sc.nextInt();
           arr[i][1]=sc.nextInt();
       }
     for(int i=0;i<arr.length;i++){
         int a=arr[i][0];
         int b=arr[i][1];
       for(int j=i+1;j<arr.length;j++){
         int c=arr[j][0]; 
         int d=arr[j][1];
        if(a==d && b==c){
           System.out.println("{"+a+","+b+"}");
            break;
}
}
}
}
} 
*/

/*
import java.util.Scanner;
public class rotateright{
 public static void main(String[]args){
     Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++){
           a[i]=sc.nextInt();
          }
      int k=sc.nextInt();
      k=k%n;
      for(int r=0;r<k;r++){
       int last=a[n-1];
      for(int i=n-1;i>0;i--){
        a[i]=a[i-1];
          }
       a[0]=last;
}
for(int num:a){
     System.out.print(num+" ");
}
}
}   

*/

import java.util.Scanner;
public class ei{
public static void main(String[]args){
     Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
         }
int totalsum=0;
 for(int i=0;i<n;i++){
     totalsum+=arr[i];
}
int leftsum=0;
int equilibriumindex=-1;
for(int i=0;i<n;i++){
     int rightsum=totalsum-leftsum-arr[i];
if(leftsum==rightsum){
    equilibriumindex=i;
     break;
}
leftsum+=arr[i];
}
System.out.println(equilibriumindex);
}
}

                    