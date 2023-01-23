import java.util.*;
public class Dia_circum_Area {
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the radius :");
        int radius=scan.nextInt();
        int diameter=2*radius;//2*r
        System.out.println("Diameter :"+diameter);
        float circumference=2*3.14f*radius;//2*pai*r
        System.out.println("circumferenc :"+circumference);
        float area=3.14f*radius*radius;//pai*r(square)
        System.out.println("area :"+area);
    }
    
}
