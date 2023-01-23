import java.util.*;
public class Alphabet {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the value :");
         char a=scan.next().charAt(0);
         if(a>='a' && a<='z'|| a>='A' && a<='Z'){
            System.out.println("Alphabet");
         }
         else{
            System.out.println("not alphabet");
         }
    }
    
}
