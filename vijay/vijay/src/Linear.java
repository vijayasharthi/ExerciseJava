import java.util.*;
public class Linear{
    public static void main(String[] args) {
        String [] sum={
            "Vijayasharathi","Shanuganathan","Pushparani","kalpanasri"};
        
        String m=str(sum,"Pushparani");
        System.out.print(m);
    }
    static String str(String[] a,String target){
        if(a.length==0){
            return "Wrong" ;
        }
        for(int i=0;i<a.length;i++){
         if(a[i]==target){
         String s=Integer.toString(i);
         return s;
        }}
        return " NOt Matched";
    }
}
