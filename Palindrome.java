import java.util.*;
public class Palindrome {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        String m=" ",b=Integer.toString(a);
        int d=b.length();
        int c=d-1;
        for(int i=c;i>=0;i--){
           m =m+b.charAt(i);
        }
        
        if(b==m){
            System.out.println("palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }
}

