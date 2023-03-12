import java.util.*;
public class Re {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
    int[]nums=new int[8];
    for(int i=0;i<nums.length;i++){
        nums[i]=scan.nextInt();
    }
    int val=2;
    ArrayList<Integer> temp=new ArrayList<Integer>();
    int count=0;
    for(int i=0;i<nums.length;i++){
       if(nums[i]!=val){
           temp.add(nums[i]);
           count++;
       }
       
    }
    System.out.println(temp.toString());
    
    System.out.println(count);//0,1,2,2,3,0,4,2
}
}

