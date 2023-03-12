import java.util.*;
public class Linear {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int[] arr=new int[a];
        for(int i=0;i<arr.length;i++){
            arr[i]=scan.nextInt();
        }
        for(int num: arr){
            System.out.println(num);
        }
    }
}
