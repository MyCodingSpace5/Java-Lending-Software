public class Stock {
    double rate = 0;
    double identifer = 0;

    String investedwhere = "";

    String type2 = "";
    double money2 = 0;
    double years2 = 0;
    public Stock(double intersetrate, String type, double id, String whereinvested, double money, double years){
        this.identifer = id;
        this.rate = intersetrate;
        this.investedwhere = whereinvested;
        this.type2 = type;
        this.money2 = money;
        this.years2 = years;
    }
    public String getInvestedwhere(){
        return investedwhere;

    }
    public String getType(){
        return type2;
    }
    public double InvestmentInfromation(){
        return rate;

    }
    public double IdentifyStock(){
        return identifer;
    }
    public double Profit(){
        return rate*money2*years2;
    }
}
