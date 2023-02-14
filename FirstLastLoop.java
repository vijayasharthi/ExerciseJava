import java.util.*;
public class FirstLastLoop {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a numbers");
        int a=scan.nextInt();
        int b=a%10;
         
        while(a>=10){
            a/=10;
        }
        System.out.println("Firstdigit"+"\t"+a);
        System.out.println("Firstdigit"+"\t"+ b);
        System.out.println(a+b);
    }
    
}
