import java.util.*;
public class TablesLoop {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a multiplicand ");//tablelike 3table or 4 table
        int a=scan.nextInt();
        System.out.println("Enter the multiplier :");//ethu varaikum like 10 varikuma
        int b=scan.nextInt();
        for(int i=0;i<=b;i++){
            System.out.println(i+"*"+a+"="+i*a);
        }
    }
}
