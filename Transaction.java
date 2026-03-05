public class Transaction{

    private double amount;
    private String date;

    public Transaction(String myDate, double myAmount){
        date = myDate;
        amount = myAmount;
    }

    public String getDate(){
        return date;
    }

    public double getAmount(){
        return amount;
    }
    public String toString(){
        return"(" + date + ", &" + amount + ")";
    }   

   
}
