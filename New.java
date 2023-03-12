import java.util.*;
public class New {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int target=3;
        for(int i=0;i<arr.length;i++){
            for(int j=1;i<arr.length;j++){
          if(arr[i]+arr[j]==target){
             System.out.print(arr[i]+""+arr[i+1]);
          }
        }
    }
}}
