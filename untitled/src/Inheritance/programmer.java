package Inheritance;

public class programmer extends Employee {
    private  int bonus;
    programmer(String name, Integer salary, Integer bonus){
        super(name, salary);
        this.bonus =  bonus;
    };

    public void printName(){

        System.out.println("your name is :" +this.getName());
    }
    public void printSalary(){

        super.printSalary();
    }
    //use of inherited this.getSalary()super class method
    public void printSalaryWithBonus(){

        System.out.println("Your salary with bonus is: "+ this.getSalary()+this.bonus);
    }
}
