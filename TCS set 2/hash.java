/*
import java.util.Scanner;
 public class chocolate{
        public static void main(String[]args){
               Scanner scan=new Scanner(System.in);
                int N=scan.nextInt();
                int a[]=new int[N];
                
                for(int i=0;i<N;i++){
                    a[i]=scan.nextInt();
                  }
                int nonzeroindex=0;
               for(int i=0;i<N;i++){
                     if(a[i]!=0){
                        a[nonzeroindex++]=a[i];
                        }
                    }
               while(nonzeroindex<N){
                   a[nonzeroindex++]=0;
                  }
             for(int num : a){
                  System.out.print(num+" ");
                  }
                    
}
}
*/
/*
import java.util.Scanner;
public class rotate{
 public static void main(String[]args){
      Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          int a[]=new int[n];
          for(int i=0;i<n;i++){
               a[i]=sc.nextInt();
             }
           int d=sc.nextInt();
           d=d%n;
           int start=0;
           int end=d-1;
           while(start<end){
             int temp=a[start];
             a[start]=a[end];
             a[end]=temp;
             start++;
             end--;
           }
           start=d;
           end=n-1;
           while(start<end){
             int temp=a[start];
             a[start]=a[end];
             a[end]=temp;
             start++;
             end--;
           }
           start=0;
           end=n-1;
            while(start<end){
             int temp=a[start];
             a[start]=a[end];
             a[end]=temp;
             start++;
             end--;
           }
          for(int num:a){
             System.out.print(num+" ");
          }
}
}
*/
/*
import java.util.Scanner;
public class greater{
    public static void main(String[]args){
      Scanner sc= new Scanner(System.in);
       int n=sc.nextInt();
       int a[]=new int[n];
       for(int i=0;i<n;i++){
             a[i]=sc.nextInt();
             }
     int result=a[0];
     int count=1;
      for(int i=0;i<n;i++){
          if(a[i]>result){
             count++;
             
           }
         }
     System.out.println(count);
}
}
*/


import java .util.Scanner;
public class hash{
 public static void main(String[]args){
      Scanner sc=new Scanner(System.in);
       String s=sc.nextLine();
       int starcount=0;
       int hashcount=0;
       for(int i=0;i<s.length();i++){
              if(s.charAt(i)=='*'){
                starcount++;
              }else{
                 hashcount++;
              }
         }
if(starcount==hashcount){
    System.out.println(0);
}else if(starcount>hashcount){
     System.out.println(starcount);
 }else{
       System.out.println(-hashcount);
}
}
}

        
