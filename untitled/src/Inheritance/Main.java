package Inheritance;

public class Main {
    public static void main (String[] args){
        programmer programmer1 = new programmer("Ram", 2000, 100);
        programmer programmer2 = new programmer("Hari", 2040, 150);

        programmer1.printName();
        programmer1.printSalary();
        programmer1.printSalaryWithBonus();
        System.out.println("-------------------");
        programmer2.printName();
        programmer2.printSalary();
        programmer2.printSalaryWithBonus();

    }
}
