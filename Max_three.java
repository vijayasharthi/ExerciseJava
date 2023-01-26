import java.util.*;
public class Max_three {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
        int d=((a>b)&&(a>c))?(b>c)?a:b:c;
        System.out.println(d);
    }
}
