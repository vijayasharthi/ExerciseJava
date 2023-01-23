import java.util.*;
public class MAX_btwntwonum {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the first number :");
        int num1=scan.nextInt();
        System.out.println("Enter the second number :");
        int num2=scan.nextInt();
       // int c=Math.max(num1,num2);
        //System.out.println(c);
        if(num1<num2)
        {
            System.out.println(num2);
        }
        else{
            System.out.println(num1);
        }
    }
    
    
}
