package corejava.streamAPI.assignment3.question1.solution.Question1;

import corejava.streamAPI.assignment3.question1.model.Student;
import java.util.*;
public class StuName {
    public List<String> getStudentNameList(List<Student> studentList){
        List<String> studentNameList = new ArrayList<>();
       for(Student student: studentList){
           studentNameList.add(student.getStudentName());
       }
       //studentNameList.forEach(System.out::println);
       return studentNameList;

    }
}
