package Student.Retrive;

import Student.Student;

import java.sql.SQLException;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Retrive retrive = new Retrive();

        System.out.println("Enter user Id: ");
        Integer userId = scanner.nextInt();

        try{
            Student student = retrive.getStudent(userId);
            if(student != null){
                System.out.println("Name: " + student.getName());
                System.out.println("Age: " + student.getAge());
                System.out.println("Batch: " + student.getBatch());
            }
            else{
                System.out.println("Student not found!!!");
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }
}
