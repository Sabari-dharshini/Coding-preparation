import java.util.Scanner;
public class chocolate{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
 int N=sc.nextInt();
 int a[]=new int[N];
 for(int i=0;i<N;i++){
    a[i]=sc.nextInt();
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

for(int num:a){
    System.out.print(num+" ");
}
}
}