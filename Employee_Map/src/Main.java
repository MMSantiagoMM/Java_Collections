import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        EmployeeDepartmentManager employeeDepartmentManager = new EmployeeDepartmentManager();
        Scanner sc = new Scanner(System.in);
        String option;


        do{

            System.out.println("""
                    Welcome to employees' system
                    These are our options
                    1. Add department
                    2. Add employee
                    3. To get employee by department
                    4. To get department by employee
                    5. To remove employee from the system
                    6. To change employee's department
                    0. Exit""");


            option = sc.next();


            String id;
            String name;
            String depart1;
            String depart2;


            switch (option){
                case "1" -> {
                    System.out.println("Adding department");
                    System.out.println("Add identification");
                    id = sc.next();
                    System.out.println("Add department's name");
                    name = sc.next();
                    System.out.println( employeeDepartmentManager.addDepartment(id,name));
                }
                case "2" -> {
                    System.out.println("Adding employee");
                    System.out.println("Add name");
                    name = sc.next();
                    System.out.println("Add identification");
                    id = sc.next();
                    System.out.println("Add first department");
                    depart1 = sc.next();
                    System.out.println("Add second department");
                    depart2 = sc.next();
                    System.out.println(employeeDepartmentManager.addEmployee(new Employee(id,name,List.of(depart1,depart2))));
                }
                case "3" -> {
                    System.out.println("Enter department's id");
                    System.out.println(employeeDepartmentManager.getEmployeesByDepartment(sc.next()));
                }
                case "4" -> {
                    System.out.println("Enter employee's id");
                    System.out.println(employeeDepartmentManager.getDepartmentsByEmployees(sc.next()));
                }
                case "5" -> {
                    System.out.println("Enter employee's id you want to delete from the system");
                    employeeDepartmentManager.removeEmployee(sc.next());
                }
                case "6" ->{
                    System.out.println("Enter employee's id you want to change form department");
                    id = sc.next();
                    System.out.println("Enter old department's id");
                    depart1 = sc.next();
                    System.out.println("Enter new department's id");
                    depart2 = sc.next();
                    employeeDepartmentManager.changeDepartmentOfEmployee(id,depart1,depart2);
                }
                case "7" -> System.out.println("Good bye");
                default -> System.out.println("Enter a valid option");

            }


        }while (!option.equals("0"));



    }
}