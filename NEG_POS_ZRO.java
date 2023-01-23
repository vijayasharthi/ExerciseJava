import java.util.*;
public class NEG_POS_ZRO {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number :");
        int num1=scan.nextInt();
        if(num1>0){
            System.out.println("postive:"+num1);
        }
        else if(num1<0){
            System.out.println("negative:"+num1);
        }
        else{
            System.out.println("ZERO");
        }
    }
    
}
