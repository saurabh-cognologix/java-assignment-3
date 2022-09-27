package corejava.streamAPI.assignment3.question1.mapper;

import corejava.streamAPI.assignment3.question1.model.Student;

public class StudentMapper {
    public static Student map(String data) {
        String[] arr = data.split(", ");
        Integer studentId = Integer.parseInt(arr[0].trim());
        String studentName = arr[1].trim();


        Student student = new Student(studentId,studentName);

        return student;
    }
}
