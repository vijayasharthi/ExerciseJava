import java.util.*;
public class ConvertTemp_celsius {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the temperature :");
        float temp=scan.nextFloat();
        float temperature=(temp-32)*5/9;
        System.out.println(temperature);
    }
    
}
