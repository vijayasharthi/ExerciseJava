import java.util.*;
import java.util.*;
public class Maxarray {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int[] arr=new int[a];
        for(int i=0;i<arr.length;i++){
            arr[i]=scan.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(Arrays.toString(arr));
            break;
        }
        int c=0;
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
        if(arr[i]>max){
            max=arr[i];
            c=max;
            }}
            System.out.println(c);
            
       }}


