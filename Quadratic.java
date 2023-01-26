import java.util.*;
public class Quadratic {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the a value:");
        int a=scan.nextInt();
        System.out.println("Enter the b value:");
        int b=scan.nextInt();
        System.out.println("Enter the c value");
        int c=scan.nextInt();
        int d=((b*b)-4*a*c);
        System.out.println(d);
        int i;
        if(d>=0){
            double num1=((-b+Math.sqrt(d))/(2*a)) ;
            double num2= (-b-Math.sqrt(d))/(2*a);
            System.out.println(num1);
            System.out.println(num2);
        }
        else if(d==0){
            double num1=-(b/(2*a));
            System.out.println(num1);
        }
        else if(d<=0){
            double num1=(-b/2*a)+(Math.sqrt(-d)/2*a);
          double  num2=(-b/2*a)-(Math.sqrt(-d)/2*a);
          System.out.println(num1);
          System.out.println(num2);
        }
    
    }
    
}
