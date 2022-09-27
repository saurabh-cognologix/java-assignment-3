package corejava.streamAPI.assignment3.question1.solution.Question6;

import corejava.streamAPI.assignment3.question1.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentName {
    public List<Student> getStudnetName(List<Student> studentList){
        //List<String> studentList = new ArrayList<>();
        List<Student> studentNameList = studentList.stream().filter((e)->e.getStudentName().length()>5).collect(Collectors.toList());
        return studentNameList;
    }
}
