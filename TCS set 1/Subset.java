import java.util.Scanner;
public class subset{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
 int a[]={1,3,4,5,9};
 int b[]={7,8,2};
int m=a.length;
int n=b.length;
 int count=0;
 for(int i=0;i<m;i++){
    for(int j=0;j<n;j++){
        
        if(b[j]==a[i]){
             count++;
             break;
        }
}
}
if(count==n){
  System.out.println("True");
}else{
 System.out.println("False");
}

}
}