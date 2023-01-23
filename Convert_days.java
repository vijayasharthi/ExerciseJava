import java.util.*;
public class Convert_days {
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the days:");
        int days=scan.nextInt();
        
        int  year=days/365;
        System.out.println(year);
        days=days%365;
        double month= days/12;
        System.out.println(month);
        days=days%12;
        double week =days/7;
        System.out.println(week);
        days=days%7;
        System.out.println(days);

        }

 }
    

