import java.util.Scanner;
public class tcs{
  public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
         String s1=sc.nextLine();
         String s2=sc.nextLine();
         String s3=sc.nextLine();
         String result="";
       for(int i=0;i<s1.length();i++){
          char c=s1.charAt(i);
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
             {
             result+='%';
           }else{
             result+=c;
           }}
for(int i=0;i<s2.length();i++){
     char c=s2.charAt(i);
     if((c>='a'&&c<='z') || (c>='A'&&c<='Z')){
        if(!(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')){
            result+='#';
            continue;
          }
}else{
     result+=c;
}
}

for(int i=0;i<s3.length();i++){
  char c=s3.charAt(i);
     if(c>='a' && c<='z'){
         result+=(char)(c-32);
}else{
       result+=c;
}
}
System.out.println(result);
}
}