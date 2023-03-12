import java.util.*;
public class Test {
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);       
           int a=scan.nextInt();
           int[] arr=new int[a];
           for(int i=0;i<arr.length;i++){
            arr[i]=scan.nextInt();
           }
           System.out.println(Arrays.toString(arr));
           int max=arr[0];
           int min=arr[0];
           for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
           }
           System.out.println(max);
           System.out.println(min);
    }
}
