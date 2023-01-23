import java.util.*;//a=p(1+r/100)power of time
public class Compound {
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the principal :");
        int principal=scan.nextInt();
        float princi=principal;
        System.out.print("Enter the rate:");
        float rate=scan.nextFloat();
        System.out.print("Ener the time : ");
        float time=scan.nextFloat();
                double  finalvalue= (principal*Math.pow((1+rate/100),(time)));
        System.out.println(finalvalue);
    }
  }
    

