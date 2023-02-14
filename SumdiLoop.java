import java.util.*;
public class SumdiLoop {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Ente a digits");
        int num1=scan.nextInt();
        int sum=0;
        while(num1!=0){
            sum+=num1%10;
            num1=num1/10;
            
        }
        System.out.println(sum);
        
            
    }
}
