import java.util.*;
public class FunctionOverriding {
    public static void main(String[] args) {
    //num();   //its called ambiguty
   System.out.println( num(0,5));
    }
    static int num(int a){
      return a;
    }
    static int num(int a,int b){
        return a+b;
      }
}
