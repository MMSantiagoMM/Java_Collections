import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeDepartmentManager {

    private List<Employee> employees = new ArrayList<>();

    private Map<String,String> departments = new HashMap<>();

    public String addDepartment(String id,String name){
        departments.put(id,name);
        return "department was added";
    }

    public String addEmployee(Employee employee){
        employees.add(employee);
        return "employee was added";
    }

    public List<Employee> getEmployeesByDepartment(String departmentId){
        List<Employee> employeesByDepartment = new ArrayList<>();
        for(Employee employee:employees){

            for (String departId:employee.getDepartmentId()){
                if(departId.equals(departmentId)){
                    employeesByDepartment.add(employee);
                }
            }
        }
        return employeesByDepartment;
    }

    public List<String> getDepartmentsByEmployees(String employeeId){
        List<String> departList = new ArrayList<>();
        for (Employee employee: employees){
            if(employee.getId().equals(employeeId)){
                for (String departId:employee.getDepartmentId()){
                        departList.add(departments.get(departId));
                }
                return departList;
            }
        }
        return new ArrayList<>();
    }

    public String removeEmployee(String id){

        for (Employee employee:employees){
            if(employee.getId().equals(id)){
                employees.remove(employee);
                return "Employee " + employee.getName() + " was removed from the system";
            }
        }
        return "This employee's id doesn't exist";
    }


    public String changeDepartmentOfEmployee(String employeeId, String oldDepartment,String newDepartment){

        for (Employee employee: employees){
            if(employee.getId().equals(employeeId)){
                for (int i = 0; i < employee.getDepartmentId().size() ; i++) {
                    employee.getDepartmentId().remove(oldDepartment);
                    employee.getDepartmentId().add(newDepartment);
                    return "The change was done";
                }

            }
        }
        return "No employee found";
    }







}
