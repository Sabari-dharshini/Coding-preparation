/*
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
  */  


import java.util.Scanner;
public class Rotate{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
       for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
           }
        int d=sc.nextInt();
        d=d%n;
        int start=0;
        int end=d-1;
          while(start<end){
             int temp=arr[start];
             arr[start]=arr[end];
             arr[end]=temp;
             start++;
             end--;
}
           start=d;
            end=n-1;
            while(start<end){

             int temp=arr[start];
             arr[start]=arr[end];
             arr[end]=temp;
             start++;
             end--;
}
          start=0;
          end=n-1;
         while(start<end){
           int temp=arr[start];
             arr[start]=arr[end];
             arr[end]=temp;
             start++;
             end--;
}
  for(int num:arr){
          System.out.print(num+" ");
       }
}
}