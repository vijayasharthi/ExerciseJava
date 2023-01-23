import java.util.*;
public class Upper_lower {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the charcter");
        char ch=scan.next().charAt(0);
        if(ch>='a' && ch<='z' ) {
            System.out.println("Lowercase");
        }
        else if(ch>='A' && ch<='Z'){
            System.out.println("Uppercase");
        }
        else{
            System.out.println("Enter only charcater");
        }
    }
    
}
