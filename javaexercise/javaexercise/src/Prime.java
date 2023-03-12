import java.util.*;
public class Prime {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        for(int i=100;i<1000;i++){
            if(Vijay(i)){
            System.out.println(i);}
           }}
    //     int a=scan.nextInt();
    // System.out.println(Vijay(a));}
    //     boolean b=Armstrong(a);
    //    System.out.println(b);
    //    System.out.println(Armstrong(a));
    //    for(int i=100;i<1000;i++){
    //     if(Armstrong(i)){
    //        System.out.print(i);
    //     }

    // }
   
    // static boolean Armstrong(int a){
    //     int sum=0;
    //     int k=a;
    //     while(a>0){
    //         int rem=a%10;
    //         a=a/10;
    //         sum+=rem*rem*rem;//armstrong na atha number cube panni add oannalum athe number varanum;
    //     }
    //     if(k==sum){
    //         return true;
    //     }
    
    //     return false;
        
    // }
  
   static  boolean Vijay(int a){
       int original=a;
       int sum=0;
       while(a>0){
        int n=a%10;
        a/=10;
        sum+=n*n*n;
  }
       if(original==sum){
        return true ;
       }
       return false;
       
      
    }

    }


