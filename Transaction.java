public class Transaction{
   
   
    private double Amount;
    private String Date;
    
    
    public Transaction(String myDate, double myAmount){
        Date = myDate;
        Amount = myAmount;
    }

    public String getDate(){
        return Date;
    }

    public double getAmount(){
        return Amount;
    }

    public String toString(){
        return"(" + Date + ", &" + Amount + ")";
    }   

   
}
