import java.util.*;
public class Arrayori {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
   int a=scan.nextInt();
        int[] arr=new int[a];
       for(int i=0;i<arr.length;i++){
        arr[i]=scan.nextInt();
       }
       for(int i=0;i<6;i++){
        int count=0;
        for(int j=0;j<6;j++){
            
            if(arr[i]==arr[j]){
                count++;
            }}
            if(count==1){
                System.out.println(arr[i]);
            }}
        
       
          
}
        

 
}
