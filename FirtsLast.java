import java.util.*;
public class FirtsLast{
public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter a numbers");
    int a=scan.nextInt();
    int b=a%10;
    while(a>=10){
        a/=10;
    }
   
    System.out.println("first digit:"+a);
    System.out.println("Last digit :"+b);
   
}
}
