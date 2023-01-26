import java.util.*;
public class marks {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the first mark");
        int a=scan.nextInt();
        System.out.print("Enter the Second mark");
        int b=scan.nextInt();
        System.out.print("Enter the third mark");
        int c=scan.nextInt();
        System.out.print("Enter the fourth mark");
        int d=scan.nextInt();
        System.out.print("Enter the fifth mark");
        int e=scan.nextInt();
        int mark=(a+b+c+d+e)/5;
        System.out.println(mark);
        if(mark>=90){
            System.out.println("GRADE A");
        }
       else if(mark>=80){
            System.out.println("GRADE B");
        }
        else if(mark>=70){
            System.out.println("GRADE C");
        }
       else if(mark>=60){
            System.out.println("GRADE D");
        }
       else  if(mark>=40){
            System.out.println("GRADE E");
        }
       else  if(mark<40){
            System.out.println("GRADE F");
        }
        else{
            System.out.println(18);
        }

    }
    
}
