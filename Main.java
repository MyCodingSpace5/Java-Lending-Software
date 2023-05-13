import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        var userchecker = new Scanner(System.in);
        System.out.println("Type of Stock");
        var stocktype = userchecker.nextLine();
        System.out.println("Rate you want to lend");
        var stocklending = userchecker.nextDouble();
        System.out.println("Which protofilo do you wanna invest in: FAANG or BANNG or CHEESE");
        var protofilo = userchecker.nextLine();
        System.out.println("Money to invest");
        var moneyinvested = userchecker.nextDouble();
        System.out.println("Years??");
        var years = userchecker.nextDouble();
        var vl = new Stock(stocklending, stocktype, 0007465, protofilo, moneyinvested, years);
        System.out.println(vl.getInvestedwhere());
        System.out.println(vl.getType());
        System.out.println(vl.InvestmentInfromation());
        System.out.println(vl.IdentifyStock());
        System.out.println("Execpted Profits if company stays in trajectory with the market" + "" +  vl.Profit());
        }
    }
