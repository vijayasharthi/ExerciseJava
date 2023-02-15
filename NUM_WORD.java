import java.util.*;
public class NUM_WORD{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        String b=Integer.toString(a);
        int c=b.length();
        char  ch;
        int i=0;
        for(i=0;i<c;i++){
            ch=b.charAt(i);
            
            if(ch=='0'){
                System.out.print(" "+"ZERO");
            }
             else if(ch=='1'){
                System.out.print(" "+"ONE");
            }
            else if(ch=='2'){
                System.out.print(" "+"TWO");
            }
            else if(ch=='3'){
                System.out.print(" "+"THREE");
            }
            else if(ch=='4'){
                System.out.print(" "+"FOUR");
            }
            else if(ch=='5'){
                System.out.print(" "+"FIVE");
            }
            else if(ch=='6'){
                System.out.print(" "+"SIX");
            }
            else if(ch=='7'){
                System.out.print("  "+ "SEVEN");
            }
            else if(ch=='8'){
                System.out.print(" "+"EIGHT");
            }
            else if(ch=='9'){
                System.out.print(" "+"NINE");
            }
            else {
                System.out.println("HI");
            }
                        
        }}
}
    
