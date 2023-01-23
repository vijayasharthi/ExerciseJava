import java.util.*;
public class notesDoubt{
 public static void main(String[] args ){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the amount:");
        int a=scan.nextInt();
        int note;
        if(a>=2000){
            note=a/2000;
            a-=note*2000;
            System.out.println("2000"+note);
        }
        if(a>=500){
           int note500=a/500;
            a-=note500*500;
            System.out.println("500"+note500);
        }
        if(a>=100){
           int note100=a/100;
            a-=note100*100;
            System.out.println("100"+note100);
        }
        if(a>=50){
           int note50=a/50;
            a-=note50*50;
            System.out.println("50"+note50);
        }
        if(a>=20){
          int  note20=a/20;
            a-=note20*20;
            System.out.println("20"+note20);
        }
        if(a>=10){
           int note10=a/10;
            a-=note10*10;
            System.out.println("10"+note10);
        }
        else{
            System.out.println("olungapadida");
        }
        scan.close();

    }
}
