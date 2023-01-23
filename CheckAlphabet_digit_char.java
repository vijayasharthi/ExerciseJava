import java.util.*;

import java.util.*;
public class CheckAlphabet_digit_char {
    public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter a value");
    char ch=scan.next().charAt(0);
    if((ch>='a' && ch<='z') || (ch>='A'  && ch<='Z')){
        System.out.println("Alphabets");
    }
    else if(ch>='0' && ch<='9'){
        System.out.println("Digits");
    }
    else{
        System.out.println("Special charcters");
    }
    

    }
    
}
