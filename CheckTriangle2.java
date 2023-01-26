import java .util.*;
public class CheckTriangle2 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
        if((a+b)>c){
            if((a+c)>b){
                if((b+c)>a){
                    System.out.println("Triangle");
                }
            }
        }
        else{
            System.out.println("not an triangle");
        }
    }
    
}
