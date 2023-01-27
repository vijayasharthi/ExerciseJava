import java.util.*;
public class SumEvenloop {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=scan.nextInt();
        int b=0;
        for(int i=0;i%2==0 && i<=a;i+=2){
            b+=i;
        }
        System.out.println(b);
    }
}
