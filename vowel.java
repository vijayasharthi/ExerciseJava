import java.util.*;
public class vowel {
    public static void main(String[] args){
Scanner scan=new Scanner(System.in);
System.out.println("Enter the value :");
char ch=scan.next().charAt(0);
if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u'|| ch=='A'|| ch=='E' || ch=='I' || ch=='O' || ch=='U' ){
    System.out.println("vowel");
}
else if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
    System.out.println("Consonant");
}
else{
    System.out.println("NOT VOWELS AND NOT CONSONANTS");
}
    }
    
}
