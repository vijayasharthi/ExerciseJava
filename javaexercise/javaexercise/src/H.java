
import java.util.*;

public class H {
    public static void main(String[] args) {
        
    int num=8;
    int a=0;
    for(int i=0;i<num;i++){
    if(num>0){
    if(num%2==0){
        num/=2;
        a++;}
       else if(num%2!=0){
            num--;
            a++;
        }}}
        System.out.println(a);}
 
}
