import java.util.*;
public class Electricity {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the unit:");
        float unit=scan.nextFloat();
        float a=0,b,c;
        if(unit<=50){
            a=unit*0.50f;
        }
        else if(unit<=150){
            a=unit*0.75f;
        }
        else if(unit<=250){
            a=unit*1.20f;
        }
        else if(unit>250){
            a=unit*1.50f;
        }
        c=a*0.20f;
         b=c+unit;
         System.out.println(b);
    }
    
}
