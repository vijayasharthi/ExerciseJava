
import java.util.*;
public class ARRAys {
 public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int a=scan.nextInt();
    int[] arr=new int[a];
    for(int i=0;i<arr.length;i++){
        arr[i]=scan.nextInt();
    }
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println(Arrays.toString(arr));
    scan.close();
 }    
}
