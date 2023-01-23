import java.util.*;
public class Even_ODD {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the first number :");
        int num1=scan.nextInt();
       
    String b=(num1%2==0)? "Even":"odd";
    System.out.println(b);
        
    }
    
}
