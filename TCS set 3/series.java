import java.util.Scanner;
public class series{
     public static void main(String[]args){
          Scanner sc=new Scanner(System.in);
            int n=14;
            int result;
            if(n%2==1){
               result=7*(n/2);
}
else{
       result=6*(n/2);
  }
System.out.println("The 15th term of the series is : "+result);
 
}
}