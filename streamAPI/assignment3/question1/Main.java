package corejava.streamAPI.assignment3.question1;

import corejava.streamAPI.assignment3.question1.model.Student;
import corejava.streamAPI.assignment3.question1.parser.StudentInputParser;
import corejava.streamAPI.assignment3.question1.solution.Question1.StuName;
import corejava.streamAPI.assignment3.question1.solution.Question2.SortByName;
import corejava.streamAPI.assignment3.question1.solution.Question3.SortByIdDesc;
import corejava.streamAPI.assignment3.question1.solution.Question4.FilterStudentId;
import corejava.streamAPI.assignment3.question1.solution.Question6.StudentName;
import corejava.streamAPI.assignment3.question1.solution.Question7.MapCreation;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
       // System.out.println("Hello Everyone");
        String filePath = "src/corejava/streamAPI/assignment3/question1/input/input.csv";
        StudentInputParser studentInputParser = new StudentInputParser();

        List<Student> studnetList = studentInputParser.parseCSVFile(filePath);
        //studnetList.forEach(System.out::println);
// 1
        StuName stuName = new StuName();
        List<String> studentNameList = stuName.getStudentNameList(studnetList);
        //print
       // studentNameList.forEach(System.out::println);

// 2
       SortByName sortByName = new SortByName();
       List<Student> sortedNameList = sortByName.getSortByName(studnetList);
       //printed all the data of sortedName list by lambda expression
//        sortedNameList.forEach((e)-> System.out.println(e));

       //printing all the data of sortedName list  by method reference
 //      sortedNameList.forEach(System.out::println);


// 3
        SortByIdDesc sortByIdDesc = new SortByIdDesc();
        List<Student> sortedStudentListById = sortByIdDesc.getIdInDescOrder(studnetList);
        //print
        //sortedStudentListById.forEach(System.out::println);
// 4

        FilterStudentId filterStudentId = new FilterStudentId();
        List<Student> filteredStudetnId = filterStudentId.getFilteredStudentList(studnetList);
        //print
      //  filteredStudetnId.forEach(System.out::println);


// 6
        StudentName studentName = new StudentName();
        List<Student> studentListByLength =  studentName.getStudnetName(studnetList);
       // studentListByLength.forEach(System.out::println);

//7
        MapCreation mapCreation = new MapCreation();
        Map<Integer,Student> stuMap = mapCreation.getMapValue(studnetList);
        stuMap.forEach((k,v)-> System.out.println(k+"    "+v));

    }
}
