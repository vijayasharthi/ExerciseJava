import java.util.*;
public class Month {
    public static void main(String[] args){//april,June,september,november---30days
        Scanner scan=new Scanner(System.in);//feburary-28/29days
        System.out.println("Enter the month");//january,march,may,july,august,october,december---31days
        String month=scan.nextLine();
        if(month=="January"){
            System.out.println("31 DAYS");
        }
        else if(month=="Feburary"){
            System.out.println("28/29 DAYS");
        }
        else if(month=="March"){
            System.out.println("31DAYS");
        }
        else if(month=="April"){
            System.out.println("20DAYS");
        }
        else if(month=="May"){
            System.out.println("31DAYS");
        }
        else if(month=="June"){
            System.out.println("30DAYS");
        }
        else if(month=="July"){
            System.out.println("31DAYS");
        }
        else if(month=="August"){
            System.out.println("31DAYs");
        }
        else if(month=="September"){
            System.out.println("30DAYS");
        }
        else if(month=="October"){
           System.out.println("31DAYS");
        }
        else if(month=="November"){
            System.out.println("30DAYS");
        }
        else if(month=="December"){
            System.out.println("31DAYS");
        }
        else {
            System.out.println("Enter only month");
        }
    }
    
}
