import java.util.*;
public class Returnfun {
    public static void main(String[] args) {
        sum(10,30);  
        sum(10,30); 
        sum(10,30); 
        sum(10,30);  
num(10,12,13,14,15,17,18);
    str("Vijayasharathi","as i a fresher i dont say that ","i have gain my knowldege and enhanced my skills to grow my carrier") ;}
    static int sum(int a,int b){
        int c=a+b;
        System.out.println(c);
        return c;   
    }
    static String str(String a,String b,String...m){
        String d=a+b+m;
        System.out.println(a);
        System.out.println(b);
        System.out.println(m);
        return d;
    }
    static void num(int ...c){// variable length argument
        System.out.print(Arrays.toString(c));
    }
}
