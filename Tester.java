public class Tester {
     public static void main(String[] args){

        MealPaySystem system = new MealPaySystem();

        System.out.println("Adding students...");

        system.addStudent("Connor");
        system.addStudent("Jack");
        system.addStudent("Brandon");
        system.addStudent("Mariana");

        System.out.println("Displaying students...");
        system.displayStudents();

        Student s1 = system.findStudent(1);
        Student s2 = system.findStudent(2);
        Student s3 = system.findStudent(3);
        Student s4 = system.findStudent(4);

        s1.buyLunch("2/4");
        s1.buyLunch("2/6");

        s2.addFunds("2/4",40);
        s2.buyLunch("2/5");

        for(int i=0;i<6;i++){
            s3.buyLunch("2/4");
        }

        s3.buyLunch("2/8");
        s3.buyLunch("2/8");

        s4.addFunds("2/9",5);
        s4.addFunds("2/9",5);

        System.out.println("Displaying students again...");
        system.displayStudents();

        System.out.println("Students with negative balances...");
        system.displayNegativeBalances();

        System.out.println("Looking up ID 2...");
        System.out.println(system.findStudent(2));

        System.out.println("Transactions on 2/4...");
        system.displayTransactionsByDate("2/4");
    }
}

