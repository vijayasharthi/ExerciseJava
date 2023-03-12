import java.util.*;
public class Y {
    static int x=10;
    public static void main(String[] args) {
         x=50;
        System.out.println(x);
        System.out.println(num(x));
    }
    static  int num(int x){
        int a=10;
        a+=x;
    System.out.println(a);
    return x;
    

}

}