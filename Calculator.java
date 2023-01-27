import java.util.*;
public class Calculator {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the symbol");
        String c=scan.nextLine();
        System.out.println("Enter the first number");
        float a=scan.nextInt();
      
        System.out.println("Enter the second number");
        float b=scan.nextInt();
       
        switch (c){
            case ("+"):
            System.out.println(a+b);
            break;
            case ("-"):
            System.out.println(a-b);
            break;

            case ("*"):
            System.out.println(a*b);
            break;

            case ("/"):
            System.out.println(a/b);
            break;
            default :
            System.out.println("Enter only above sysmbols");



        }
        
        
    }
}