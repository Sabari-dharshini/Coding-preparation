import java.util.Scanner;
public class monkey{
    public static void main(String[]args){
          Scanner sc=new Scanner(System.in);
             int n=sc.nextInt();
             int k=sc.nextInt();
             int j=sc.nextInt();
             int m=sc.nextInt();
             int p=sc.nextInt();
             
                if (n <= 0 || k <= 0 || j <= 0 || m < 0 || p < 0) {
            System.out.println("INVALID INPUT");
            return;
        }
             int bananaseaten=m/k;
             int peanutseaten=p/j;
             int totaleaten=bananaseaten+peanutseaten;
             if(m%k!=0||p%j!=0){
                    totaleaten+=1;
                }
         int monkeysLeft = n - totaleaten;
        if (monkeysLeft < 0) {
            monkeysLeft = 0;
        }
             System.out.println("The number of monkeys left on the tree : "+monkeysLeft);
                     
}
}