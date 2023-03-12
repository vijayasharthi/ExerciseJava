import java.util.*;
public class Vijay {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        ArrayList<Character> list=new ArrayList<Character>();
        for(int i=0;i<a;i++){
            list.add(scan.next().charAt(0));
        }
        for(int i=0;i<a;i++){
        System.out.println(list.get(i));
        }
        for(int i=0;i<a;i++){
            for(int j=i+1;j<a;j++){
                if(list.get(i)==list.get(j)){
                    System.out.println(list.get(i));
                }
            }
        }
    }
}
