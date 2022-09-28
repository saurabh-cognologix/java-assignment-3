package corejava.streamAPI.assignment3.question1.solution.Question7;

import corejava.streamAPI.assignment3.question1.model.Student;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapCreation {
    public Map<Integer, Student> getMapValue(List<Student> studentList){
//        Map<Integer,Student> tempMap = new HashMap<>();
//        for(Student student : studentList){
//            Integer studentId = student.getStudentId();
//            tempMap.put(studentId,student);
//        }
//
//         tempMap.forEach((k,v)-> System.out.println("Key :" + k+"  " +"Value :" + v));

        //By using stream
        Map<Integer,Student> tempMap;
        tempMap = studentList.stream().collect(Collectors.toMap(
                Student::getStudentId, Function.identity()
        ));

      // tempMap.forEach((k,v)-> System.out.println(k+"  "+v));


    /*
        Map<Integer, Student> studentMap = studentList.stream()
                .collect(Collectors.toMap(Student::getStudentId, student -> student, (oldValue, newValue) -> oldValue));
        studentMap.forEach((k,v)-> System.out.println(k+ "        "+v));

        */

        return tempMap;

    }
}
