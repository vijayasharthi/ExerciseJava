import java.util.*;
public class CovertTemperature_Farehenheit{
public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    System.out.print("Enter the temperature :");
    float temp=scan.nextFloat();//(1c*9/5)+32 if convert from celsiusto farenheit
    float temperature=(temp*9/5f)+32;
    System.out.println("temperature is :" +temperature);
    //(50F-32)*5/9 is for convert from farenheit to celsius
}
}