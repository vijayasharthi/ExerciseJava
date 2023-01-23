import java.util.*;
public class Calculate_Thridangle{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the First angle :");
        int first_Angle=scan.nextInt();
        System.out.print("Enter the Scecond_Angle");
        int Second_Angle=scan.nextInt();
        int Thrid_angle =180-(first_Angle+Second_Angle);
        System.out.println(Thrid_angle);

    }

}