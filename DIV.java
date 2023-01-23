import java.util.*;
public class DIV {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number :");
        int num1=scan.nextInt();
        if(num1%5==0){
            System.out.println(num1+"is divisible by 5");
        }
        
         if(num1%11==0){
            System.out.println(num1+"is divisible by 11");
        }
        else{
            System.out.println("no number is divisible by 5 and 11");
        }
    }
    
}
