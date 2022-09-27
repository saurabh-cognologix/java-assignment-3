package corejava.streamAPI.assignment3.question2.parser;


import corejava.streamAPI.assignment3.question2.mapper.ServerMapper;
import corejava.streamAPI.assignment3.question2.model.Server;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ServerParser {
    public List<Server> parseCSVFile(String filePath){
        List<Server> list = new ArrayList<>();
        BufferedReader br = null;
        String st;
        try {
            File file = new File(filePath);
            br = new BufferedReader(new FileReader(file));
            while ((st = br.readLine())!=null){
                Server server = ServerMapper.map(st);
                list.add(server);
            }
        }catch (IOException ioException){
            throw new RuntimeException(ioException);
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
