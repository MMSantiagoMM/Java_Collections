import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        StudentGradeManagement studentGradeManagement = new StudentGradeManagement();

        int option;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("""
                    Welcome to our student's system
                    These are our options
                    1. Add student and their grade
                    2. Update a student's grade
                    3. Remove student
                    4. Retrieve a student's grade
                    5. Calculate the average grade of students
                    6. Print all students and their grades in alphabetical order of student names""");

            option = sc.nextInt();
            String name;
            String grade;

            switch (option){
                case 1 -> {
                    System.out.println("Enter student's name");
                    name = sc.next();
                    System.out.println("Enter student's grade");
                    grade = sc.next();
                    System.out.println(studentGradeManagement.addStudentAndGrade(name,grade));
                }
                case 2 -> {
                    System.out.println("Update a student's grade");
                    System.out.println("Enter student's name");
                    name = sc.next();
                    System.out.println("Enter new student's grade");
                    grade = sc.next();
                    System.out.println(studentGradeManagement.updateGrade(name,grade));
                }
                case 3 -> {
                    System.out.println("Remove a student");
                    System.out.println("Enter student's name");
                    name = sc.next();
                    System.out.println(studentGradeManagement.removeStudent(name));
                }
                case 4 -> {
                    System.out.println("Enter student's name");
                    name = sc.next();
                    System.out.println(studentGradeManagement.retrieveGrade(name));
                }
                case 5 -> System.out.println(studentGradeManagement.calculateAverageGrades());
                case 6 -> System.out.println(studentGradeManagement.printAllStudents());
                default -> System.out.println("Enter a valid option");
            }
        }while (option != 0);
    }
}