import java.util.*;
public class MAX_Btwn_threenum {
    
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the first number :");
        int num1=scan.nextInt();
        System.out.println("Enter the second number :");
        int num2=scan.nextInt();
        System.out.println("Enter the second number :");
        int num3=scan.nextInt();
      
        if(num1<num2)
        {
            System.out.println(num2);
            
        if(num2>num3){
                System.out.println(num2);
            }
            else{
                System.out.println(num3);
            } 
        }
        else if(num1<num3){
            System.out.println(num3);
        }
        else{
            System.out.println(num1);
        }
    }  
}


