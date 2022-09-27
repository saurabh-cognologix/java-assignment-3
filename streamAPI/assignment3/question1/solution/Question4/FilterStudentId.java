package corejava.streamAPI.assignment3.question1.solution.Question4;

import corejava.streamAPI.assignment3.question1.model.Student;
import java.util.List;
import java.util.stream.Collectors;

public class FilterStudentId {
    public List<Student> getFilteredStudentList(List<Student> studentList){
        List<Student> filteredStudentListById = studentList.stream().filter((e)->e.getStudentId()>23).collect(Collectors.toList());
        //filteredStudentListById.forEach(System.out::println);
        return filteredStudentListById;
    }
}
