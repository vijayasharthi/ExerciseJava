import java .util.*;
public class Calculate_sqrt {
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number :");
        int num=scan.nextInt();
        int a=(int) Math.sqrt(num);
        System.out.println(Math.sqrt(num));
        System.out.println(a);
    }
    
}
