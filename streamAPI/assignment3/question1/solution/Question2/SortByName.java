package corejava.streamAPI.assignment3.question1.solution.Question2;

import corejava.streamAPI.assignment3.question1.model.Student;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//public class SortByName implements Comparator<Student> {
//        public int compare(Student a, Student b) {
//            return a.getStudentName().compareTo(b.getStudentName());
//        }
//
//        public List<Student> getSortByName(List<Student> studentList){
//             Collections.sort(studentList, new SortByName());
//             //studentList.forEach(System.out::println);
//             return null;
//        }
//
//
////    List<Student> sortedListByName = studentList.stream()
////            .sorted(Comparator.comparing(Student::getName))
////            .collect(Collectors.toList());
//
//}

public class SortByName{
    public List<Student> getSortByName(List<Student> studentList){
        List<Student> sortedListByName = studentList.stream()
          .sorted(Comparator.comparing(Student::getStudentName))
           .collect(Collectors.toList());
        return sortedListByName;
        }
}
