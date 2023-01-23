import java.util.*;
public class WEEks {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the day:");
        int a=scan.nextInt();
        if(a==1)
        {
            System.out.println("Monday");
        }
        else if(a==2){
            System.out.println("Tuesday");
        } 
       else if(a==3){
        System.out.println("Wednesday");
       }
       else if(a==4){
        System.out.println("Thursday");
       }
       else if(a==5){
        System.out.println("Friday");
       }
       else if(a==6){
        System.out.println("Saturday");
       }
       else if(a==7){
        System.out.println("Sunday");
       }
       else{
        System.out.println("Enter the days 1-7 only");
       }
    }
    
}
