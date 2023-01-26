import java.util.*;
public class Profit_Loss {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the costprice");
        int costprice=scan.nextInt();
        System.out.println("Enter the selling price");
        int sellingprice=scan.nextInt();
        int num1=sellingprice-costprice;
        System.out.println(num1);
        if(costprice <sellingprice){
            System.out.println("Profit");
        }
        else if(costprice>sellingprice){
            System.out.println("Loss");
        }
        else{
            System.out.println("NO LOSS");
        }
    }
    
}
