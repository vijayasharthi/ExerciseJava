
import java.util.*;
public class Lsb {
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the LSB:");
        int a=scan.nextInt();
        String abc= String.valueOf(a);
        int aa=abc.length();
        System.out.println(aa);
        char  bb=abc.charAt(0);
        char cc=abc.charAt(aa-1);
        System.out.println(bb+"is an MSB"+"\n"+cc+"is an LSB");

    }
    
}
