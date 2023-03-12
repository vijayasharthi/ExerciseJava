import java.util.*;
public class Shift {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int[] arr=new int[a];
        for(int i=0;i<arr.length;i++){
            arr[i]=scan.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int[] arr1={};int[] arr2={};
        for(int i=0;i<arr.length;i++){
            arr1[i]=arr[i+2];
        }
        for(int i=0;i<arr.length/2;i++){
            arr2[i]=arr[i];
        }
        int[] nums=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(i<2){
                nums[i]=arr1[i];
            }
            else {
                nums[i]=arr2[i];
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
