import java.util.*;
public class SwappArray {
    public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
        int[] a={10,20,30,40,50,60,70,80,90,100};
        // for(int i=0;i<a.length;i++){
        //     System.out.println(a[i]);
        // }
        int c=scan.nextInt();
        
        for(int i=0;i<c;i++){
            a[a.length-i]=a[i];

        }for(int i=0;i<a.length-1;i++){
            a[i]=a[i+1];
       }
        System.out.println(Arrays.toString(a));
    }
}
