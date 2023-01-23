import java.util.*;
public class Leap{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the year :");
        int i=scan.nextInt();
        if(i%4==0 && i%100!=0){
            System.out.println("Leap year ");
        }
        else{
            System.out.println("not Leap year");
        }

    }
}