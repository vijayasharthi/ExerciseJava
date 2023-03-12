import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args){
       Scanner scan=new Scanner(System.in);
       String a,c = "";
       a = scan.nextLine();
       int b = a.length();
       for(int i=b-1;i>=0;i--){
        c = c + a.charAt(i);
       }
       if(c.equals(a)){// .equals for comparing string in that case we have checkalso case sensitive like MalayalaM
        System.out.println("Palindrome");//.equalsignorecase() means i doesnot consider about case sensitives.
       }
       else{
        System.out.println("Not palindrome");
       }
    }}//lexiographically (s1.compareT(s2));
    //substring(0,1).toUppercase()+substring(1);



