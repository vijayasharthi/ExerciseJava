import java.util.*;
public class Area_Triangle {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the height of a triangle:");
        int height=scan.nextInt();
        System.out.print("Enter the baseof triangle:");
        int base=scan.nextInt();
        System.out.println((height*base)/2);
    }
    
}
