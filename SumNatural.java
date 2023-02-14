
import java.util.*;
public class SumNatural {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=scan.nextInt();
        String b=Integer.toString(a);
        int c=b.length();
        int d=0;
        for(int i=0;i<=c;i++){
             d+=i;       
        }
        System.out.println(d);
    }
}
