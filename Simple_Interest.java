//A=(p*r*t)/100
//p=initial principal balance
//r=annual interest rate
import java .util.*;
public class Simple_Interest{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the principal balance :");
        int Principalvalue=scan.nextInt();
        System.out.print("Enter the annual interest rate :");
        float annualrate=scan.nextFloat();
        System.out.print("Enter the time :");
        int time=scan.nextInt();
        float finalvalue=((Principalvalue*annualrate*time)/100);
        System.out.println(finalvalue);
    }
}