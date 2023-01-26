import java.util.*;
public class Even__odd {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int a =scan.nextInt();
        int even=0;
        int odd=1;;
        int b=(a%2==0)?even:odd;
        System.out.println(b);

    }
    
}
