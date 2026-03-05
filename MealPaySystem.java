import java.util.*;

public class MealPaySystem{

    private ArrayList<Student> students;

    public MealPaySystem(){
        students = new ArrayList<Student>();
    }

    public void addStudent(String name){
        students.add(new Student(name));
    }

    public Student findStudent(int id){

        for(Student s : students){
            if(s.getID() == id){
                return s;
            }
        }

        return null;
    }

    public void displayStudents(){

        for(Student s : students){
            System.out.println(s);
        }
    }

    public void displayNegativeBalances(){

        for(Student s : students){
            if(s.getBalance() < 0){
                System.out.println(s);
            }
        }
    }

    public void displayTransactionsByDate(String date){

        for(Student s : students){

            ArrayList<Transaction> list = s.getTransactionsByDate(date);

            for(Transaction t : list){
                System.out.println(t + " by " + s.getName() + " ID: " + s.getID());
            }
        }
    }
}

