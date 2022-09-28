package corejava.streamAPI.assignment3.question1.model;

import java.util.function.Function;

public class Student  {
    private Integer studentId;
    private String studentName;

    public Student(Integer studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public Student() {
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        String placeHolder = "Student Id : {0}, Student Name : {1}";
        return java.text.MessageFormat.format(placeHolder,studentId,studentName);
    }
}
