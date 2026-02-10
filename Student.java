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
        return s;
    }
}