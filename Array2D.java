import java.util.*;
public class Array2D {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int[][] arr=new int[a][b];
        for(int i=0;i<arr.length;i++){
          for(int j=0;j<arr.length;j++){
            arr[i][j]=scan.nextInt();
          }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]);
               // System.out.println(Arrays.toString(arr[i][j]));
            }
            System.out.println();
        }
    }
}
