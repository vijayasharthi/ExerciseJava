import java.util.*;
public class Duplicate {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        ArrayList<Integer> arr=new ArrayList<Integer>(8);
        System.out.println("Enter the size");
        for(int i=0;i<3;i++){
            arr.add(scan.nextInt());
        }
        for(int i=0;i<3;i++){
            System.out.println(arr.get(i));
        }
       
         for(int i=0;i<3;i++){
             for(int j=i+1;j<3;j++){
                 if (arr.get(i)==arr.get(j)) {
                      System.out.println(arr.get(i));
                 }
             }
             
        }
    }
}
