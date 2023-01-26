import java.util.*;

import javax.sound.sampled.SourceDataLine;

import java.util.*;
public class Leap_Ternay {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int leap=0;
        int notleap=1;
        int b=(a%4==0 && a%100 !=0)?(leap):(notleap);
        System.out.println(b);
    }
    
}
