import java.util.*;
public class ProductLoop {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int sum=1;
        while(a!=0){
            sum=sum*(a%10);
            a=a/10;
        }
        System.out.println(sum);
    }
}
