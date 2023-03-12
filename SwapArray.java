import java.util.*;
public class SwapArray {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);{
            int a=scan.nextInt();
            int[] arr=new int[a];
            for(int i=0;i<arr.length;i++){
                arr[i]=scan.nextInt();
            }
            for(int i=0;i<arr.length;i++){
                System.out.println(Arrays.toString(arr));
                break;
            }
            System.out.print("Enter the number1 to swap:"+" ");
            int b=scan.nextInt();
            System.out.print("Enter the number2 to swap:"+" ");
            int c=scan.nextInt();
            int temp;
            temp=arr[b];
            arr[b]=arr[c];
            arr[c]=temp;
            System.out.println(Arrays.toString(arr));
        }
    }
}
