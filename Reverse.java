import java.util.*;
public class Reverse {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String a=scan.nextLine();
        int b=a.length();
        int e=b-1;
        char d=0;
        for(int i=e;i>=0;i--){
            char c=a.charAt(i);
            d=c;
        System.out.print(d);
        }
        

    }
}
