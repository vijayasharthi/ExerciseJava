import java.util.*;
import java.util.*;
public class Array {
    static void change(int[] num){
        num[0]=5;
    } 
public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    int a=scan.nextInt();
    int[] arr=new int[a]; 
    for(int i=0;i<arr.length;i++){
        arr[i]=scan.nextInt();
    }
    System.out.println(Arrays.toString(arr));
    change(arr);
    System.out.println(Arrays.toString(arr));

        
    
}    
}
