import java.util.*;
public class Convertcm_into_M_KM {
    public static void main(String [] args){
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter the CM:");//CM---CentiMtere
        int Cm =scan.nextInt();//
                String Metre=Cm/100+"M";
        System.out.println("Mtere :"+Metre);//!KM=1000m
        double Kilometre=Cm/100000d;
System.out.println("KILOMETRE :"+Kilometre);

    }
    
}
//1cm=1e-5
//1km=100000cm
//1cm=0.01m
//1m=100cm
//1m=0.001km