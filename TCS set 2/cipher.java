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
import java.util.Scanner;
public class washing{
 public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
      int w=sc.nextInt();
    if(w<0||w>7000){
      System.out.println("INVALID INPUT");
 }else if(w==0){
      System.out.println("Time estimated : 0 minutes ");
}else if(w>0 && w<2000){
      System.out.println("Time estimated : 25 minutes ");
}else if(w>=2000 && w<=4000){
      

         
                 