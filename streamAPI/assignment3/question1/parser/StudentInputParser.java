package corejava.streamAPI.assignment3.question1.parser;

import corejava.streamAPI.assignment3.question1.mapper.StudentMapper;
import corejava.streamAPI.assignment3.question1.model.Student;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentInputParser {
    public List<Student> parseCSVFile(String filePath) {
        List<Student> list = new ArrayList<>();
        BufferedReader br = null;
        String st;
        try {
            File file = new File(filePath);
            br = new BufferedReader(new FileReader(file));
            while ((st = br.readLine())!=null){
                Student student = StudentMapper.map(st);
                list.add(student);
            }
            // System.out.println(list);
        }catch (IOException e){
            throw new RuntimeException(e);
        }finally {
            if(br!=null){
                try {
                    br.close();
                }catch (Exception e){
                    throw new RuntimeException(e);
                }
            }
        }

        return list;
    }
}
