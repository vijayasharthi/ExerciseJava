import java.util.*;
public class Sumloop {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        String b=Integer.toString(a);
        int s=b.length();
        int sum=0;
       s-=2;
       int m=b.length();
       int e=a%10;
       int f=0;
       while(a>0){
        sum+=a%10;
        f=a;
        a/=10;
       
       }
       char c=0;
       System.out.print(e);
        for(int d=1;d<=s;d++){
            c=b.charAt(d);
              System.out.print(c);
        }
        System.out.println(f);
        System.out.println(sum);
        
    }
}
