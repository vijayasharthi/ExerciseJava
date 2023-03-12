import  java.util.*;
public class MAXINarray{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
      //  ArrayList<Integer> list=new ArrayList<Integer>();
       // list.add(67);
        //list.contains(67);
        //list.set(0,99);
        //list.remove(0);
        int [] arr=new int[a];
        for(int i=0;i<arr.length;i++){
             arr[i]=scan.nextInt();
        }
        System.out.println(Arrays.toString(arr))
    }
}