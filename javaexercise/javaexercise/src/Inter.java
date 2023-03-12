import java.util.*;
public class Inter {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int[] arr=new int[a];
        for(int i=0;i<arr.length;i++){
            arr[i]=scan.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int b=scan.nextInt();
        int[] arr1=new int[b];
        for(int i=0;i<arr.length;i++){
            arr1[i]=scan.nextInt();
        }
        System.out.println(Arrays.toString(arr1));
        int[] arr2={};
        int j=0;
        for(int i=0;i<8;i++){
            if(j<=8){
              arr2[j]=arr[i];
              arr2[j+1]=arr1[i];
              j+=2;  }  
        }
        System.out.println(Arrays.toString(arr2));
    }
}
