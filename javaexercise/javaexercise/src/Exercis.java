import java.util.*;
public class Exercis {
    static boolean  check(int a){
        if(a<100){
        return true;}
        else{
      
            return false;
        }
    }
public static void main(String[] args) {
    boolean num1=check(10);
    boolean num2= check(100);
    boolean num3 =check(90);
    boolean num4 =check(21);
    boolean num5 =check(251);
    System.out.println(num1+" "+num2+" "+num3+" "+num4+" "+num5);
}    
}
