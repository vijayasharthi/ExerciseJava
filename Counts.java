import java.util.*;

public class Counts {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number:");
        // String a=scan.nextLine();
        int a = scan.nextInt();
        int b = 0;
        while (a != 0) {
            a /= 10;
            b++;
        }
        System.out.println(b);
    }
}
