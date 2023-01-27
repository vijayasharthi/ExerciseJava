import java.util.*;
public class EvenLoop {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
    System.out.println("Enter the number between 1=100");
        int a=scan.nextInt();
        int i=2;
        while(i<=a && i%2==0)  {
            System.out.println(i);
            i++;
            i++;
        }
}
}
