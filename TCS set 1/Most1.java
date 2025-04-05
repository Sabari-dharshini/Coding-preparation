import java.util.Scanner;
public class Most1{
    public static void main(String[]args){
         Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          int m=sc.nextInt();
          int [][]M=new int[n][m];
          int maxcount=-1;
          int maxindex=-1;
          for(int i=0;i<n;i++){
               int count=0;
              for(int j=0;j<m;j++){
                 M[i][j]=sc.nextInt();
               if(M[i][j]==1){
                 count++;
                }
}
                if(count>maxcount){
                     maxcount=count;
                     maxindex=i;
           } 
        }
       System.out.println(maxcount!=0?maxindex:-1);
           
}
}