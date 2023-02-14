import java.util.*;

public class FirstLastswap {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a numbers:");
        int a = scan.nextInt();
        int num2 = a % 10;
        int num1 = a;
        while (num1 >= 10) {
            num1 /= 10;
        }
        String b = Integer.toString(a);
        int c = b.length();
        System.out.println(c);
        char d =b.charAt(1);
        char e=b.charAt(2);
        char f=b.charAt(3);
        System.out.println(num2+""+d+""+e+""+f+""+num1);  
    }
    }

    
