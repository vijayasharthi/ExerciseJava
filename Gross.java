import java.util.*;
public class Gross {
    
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("BASIC SALARY");
        double a=scn.nextInt();
        
        double da=0,hdr=0;
        if(a<=10000){
             da=a*0.8;
             hdr=a*0.2;
        }
        else if(a<=10001 && a>=20001){
             da=a*0.9;
             hdr=a*0.25;
        }
        else if(a>=20001){
             da=a*0.95;
             hdr=a*0.3;
        }
       
       
         double gross=a+da+hdr;
        System.out.println(gross);
    }
}
