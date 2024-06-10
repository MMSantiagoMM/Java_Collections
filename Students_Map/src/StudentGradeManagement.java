import java.util.*;
import java.util.stream.Stream;

public class StudentGradeManagement {

    Map<String,String> studentsAndGrades;

    public StudentGradeManagement() {
        this.studentsAndGrades = new HashMap<>();
    }


    String addStudentAndGrade(String name, String grade){
        if(!studentsAndGrades.containsKey(name)){
            try {
                Validation.validateName(name);
                Validation.validateGrade(grade);
                studentsAndGrades.put(name,grade);
                return "A new student was added";
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
            return "";

        }else {
            return "This student already exists";
        }
    }

    String updateGrade(String name, String grade){
        if(studentsAndGrades.containsKey(name)){
            studentsAndGrades.replace(name,grade);
            return "Student's grade was updated";
        }
        return "No student found";
    }

    String removeStudent(String name){
        if (studentsAndGrades.containsKey(name)){
            studentsAndGrades.remove(name);
            return "Student was removed";
        }
        return "No student found";
    }

    String retrieveGrade(String name){
        if(studentsAndGrades.containsKey(name)){
            return studentsAndGrades.get(name);
        }
        return null;
    }

    Double calculateAverageGrades(){
        //double sum = studentsAndGrades.values().stream().reduce(0.0,Double::sum);
        double sum = 0;
        for (String value:studentsAndGrades.values()){
            sum += Double.valueOf(value);
        }
        return sum / studentsAndGrades.size();
    }

    List<Map.Entry<String,String>> printAllStudents(){
        List<Map.Entry<String,String>> studentsSorted = new ArrayList<>(studentsAndGrades.entrySet());
        studentsSorted.sort((Map.Entry.comparingByKey()));
        return studentsSorted;
    }



}
