package corejava.streamAPI.assignment3.question1.solution.Question3;

import corejava.streamAPI.assignment3.question1.model.Student;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortByIdDesc {
     public List<Student> getIdInDescOrder(List<Student> studentList){
             List<Student> sortedListByIdDesc = studentList.stream()
            .sorted(Comparator.comparing(Student::getStudentId).reversed())
            .collect(Collectors.toList());

            // sortedListByIdDesc.forEach(System.out::println);
             return sortedListByIdDesc;
     }
}
