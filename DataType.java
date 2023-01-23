import java.util.*;
public class DataType{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        byte c;
        short z;
         String a="Welcome";
        // int b=Integer.parseInt(a);
         System.out.println(a);
        System.out.print("Ener your RollNumber:");
        String RollNUmber=scan.nextLine();
         System.out.print("Enter your Name:");
        String Name=scan.nextLine();
        System.out.print("Enter your initial:");
        char i=scan.next().charAt(0);
        System.out.print("Enter your phone number:");
        long phonenumber=scan.nextLong();
        System.out.print("Enter your 10th mark percentage:");
        float tenthmark=scan.nextFloat();
        System.out.print("Enter your 11 and 12th mark percentage:");
        double mark=scan.nextDouble();
       System.out.print("Enter your age:");
       boolean age=scan.nextBoolean();
    }

}


        