import java.util.*;
public class TYPESTrIngle {
 public static void main(String[] args)   {
    Scanner scan=new Scanner(System.in);
    int a=scan.nextInt();
    int b=scan.nextInt();
    int c=scan.nextInt();
    if((a==b)&&(a==c)){
        System.out.println("Equialateral trainagle");
    }
    else if((a==b)||(a==c)||(b==c)){
        System.out.println("ISOcELES TRIANGLE");
    }
    else{
        System.out.println("scalene triangle");
    }
 }
}
