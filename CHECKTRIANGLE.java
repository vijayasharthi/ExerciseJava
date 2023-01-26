
import java.util.*;
public class CHECKTRIANGLE {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
        int d=a+b+c;
        if(d==180 && a==60 && b==60 && c==60){
            System.out.println("IT IS AN TRIANGLE");
        }
        else{
            System.out.println("NOT A TRIANGLE");
        }
    }
    
}
