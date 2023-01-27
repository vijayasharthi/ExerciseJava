import java.util.*;
public class Alpabet_loop {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a alphabet");
        char ch=scan.next().charAt(0);
        char  i=97;
        while(i<=ch){
System.out.println(i);
i++;
        }
    }
}
