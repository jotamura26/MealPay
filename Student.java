import java.util.*;

public class Student{

    private String name;
    private double balance;
    private int idNo;
    private static int idGen = 1;
    private ArrayList<Transaction> transactions;

    public Student(String myName){
        name = myName;
        balance = 0;
        idNo = idGen;
        idGen++;
        transactions = new ArrayList<Transaction>();
    }

    public String toString(){
        String s = "Name: " + name + " ID: " + idNo + " Balance: $" + balance;
        s+= " Transactions: ";
        for(Transaction t : transactions){
            s+= t;
        }
        return s;}

    public int getID(){
        return idNo;
        }
    public double getBalance(){
        return balance;
    }
    public String getName(){
        return name;
    }
    
    public void addFunds(String date, double amount){
        balance += amount;
        transactions.add(new Transaction(date, amount));
    }
     public void buyLunch(String date){
        balance -= 7;
        transactions.add(new Transaction(date, -7));
    }

    public ArrayList<Transaction> getTransactionsByDate(String date){

        ArrayList<Transaction> byDate = new ArrayList<Transaction>();
        for(Transaction t: transactions){
            if(t.getDate().equals(date)){
                byDate.add(t);
            }
        }
        return byDate;
    }
}