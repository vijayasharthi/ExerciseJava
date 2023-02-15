import java.util.*;
public class AScii {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        char a=scan.next().charAt(0);
        char b=scan.next().charAt(0);
        for(int i=a;i<b;i++){System.out.println(i);}
    }
    
}
