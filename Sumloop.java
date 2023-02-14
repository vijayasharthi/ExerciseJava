import java.util.*;
public class Sumloop {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        String b=Integer.toString(a);
        int s=b.length();
       s-=2;
       int e=a%10;
       while(a>=10){
        a/=10;
       }
       char c=0;
       System.out.print(e);
        for(int d=1;d<=s;d++){
            c=b.charAt(d);
            System.out.print(c);
        }
        System.out.println(a);
        System.out.println(e+c+a);
    }
}
