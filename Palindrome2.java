import java.util.Scanner;
public class Palindrome2{
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number");
        int r,sum = 0,temp;
        int n = reader.nextInt();

        temp = n;
        while(n>0){
            r = n%10;
            sum = (sum*10)+r;
            n = n/10;
        }
        if(temp==sum){
            System.out.println("The given number is palindrome");
        }else{
            System.out.println("The given number is not a palindrome");
        }
    }
}