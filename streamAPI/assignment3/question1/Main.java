package corejava.streamAPI.assignment3.question1;

import corejava.streamAPI.assignment3.question1.model.Student;
import corejava.streamAPI.assignment3.question1.parser.StudentInputParser;
import corejava.streamAPI.assignment3.question1.solution.Question1.StuName;
import corejava.streamAPI.assignment3.question1.solution.Question2.SortByName;
import corejava.streamAPI.assignment3.question1.solution.Question3.SortByIdDesc;
import corejava.streamAPI.assignment3.question1.solution.Question4.FilterStudentId;
import corejava.streamAPI.assignment3.question1.solution.Question6.StudentName;

import java.util.List;

public class Main {
    public static void main(String[] args) {
       // System.out.println("Hello Everyone");
        String filePath = "src/corejava/streamAPI/assignment3/question1/input/input.csv";
        StudentInputParser studentInputParser = new StudentInputParser();

        List<Student> studnetList = studentInputParser.parseCSVFile(filePath);
        //studnetList.forEach(System.out::println);

        StuName stuName = new StuName();
        List<String> studentNameList = stuName.getStudentNameList(studnetList);
        //print
       // studentNameList.forEach(System.out::println);

        //2
       SortByName sortByName = new SortByName();
       List<Student> sortedNameList = sortByName.getSortByName(studnetList);
       sortedNameList.forEach(System.out::println);


        SortByIdDesc sortByIdDesc = new SortByIdDesc();
        List<Student> sortedStudentListById = sortByIdDesc.getIdInDescOrder(studnetList);
        //print
        //sortedStudentListById.forEach(System.out::println);

        FilterStudentId filterStudentId = new FilterStudentId();
        List<Student> filteredStudetnId = filterStudentId.getFilteredStudentList(studnetList);
        //print
      //  filteredStudetnId.forEach(System.out::println);


        StudentName studentName = new StudentName();
        List<Student> studentListByLength =  studentName.getStudnetName(studnetList);
        studentListByLength.forEach(System.out::println);

    }
}
