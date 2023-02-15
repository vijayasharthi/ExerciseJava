import java.util.*;
public class Productlloop {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        String b=Integer.toString(a);
        int c=b.length();
        c-=2;
        int product=1;
        int e=a%10;
        int f=0;
        System.out.print(e);
        while(a>0){
            product*=a%10;
            f=a;
            a/=10;
        }
char j;
        for(int i=1;i<=c;i++){
             j=b.charAt(i);  
             System.out.print(j); 
        }
       
        System.out.print(f);
        System.out.println();
        System.out.println(product);

    }
}
