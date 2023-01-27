import java.util.*;
public class Oddloop {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number ");
        int num1=scan.nextInt();
        int i=1;
        while(i<=num1 && i%2!=0){
            System.out.println(i);
            i++;
            i++;
        }
    }
}
