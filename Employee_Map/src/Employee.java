import java.util.ArrayList;
import java.util.List;

public class Employee {

    private String id;

    private String name;

    private List<String> departmentId = new ArrayList<>();

    public Employee() {
    }

    public Employee(String id, String name, List<String>departmentId) {
        this.id = id;
        this.name = name;
        this.departmentId.addAll(departmentId);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(List<String> departmentId) {
        this.departmentId.addAll(departmentId);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", departmentId='" + departmentId + '\'' +
                '}';
    }
}
