import java.util.*;
public class Shadowing {
    static int a=50;
   static int b=50;
 public static void main(String[] args) {
    int a=40;
    int b=50;
    num();
    num();
    num1(40,50);
    System.out.println(a+b);
    //90
 }
 static void num(){
    System.out.println(a+b);//100
 }
 static int num1(int a,int b){
    System.out.println(a+b);
    return a+b;
 }
    }
    
   

