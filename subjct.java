import java.net.SocketTimeoutException;
import java.util.*;
public class subjct {
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the first subject mark :");
        int a=scan.nextInt();
        System.out.print("Enter the second subject mark :");
        int b=scan.nextInt();
        System.out.print("Enter the third subject mark :");
        int c=scan.nextInt();
        System.out.print("Enter the fourth subject mark :");
        int d=scan.nextInt();
        System.out.print("Enter the fifth subject mark :");
        int e=scan.nextInt();
        int total=a+b+c+d+e;
        System.out.println(total);
        int average=total/5;
        System.out.println(average);
      System.out.println((total/500f)*100);

    }

    
}
