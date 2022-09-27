package corejava.streamAPI.assignment3.question2;

import corejava.streamAPI.assignment3.question2.Solution.Question1.ServerList;
import corejava.streamAPI.assignment3.question2.model.Server;
import corejava.streamAPI.assignment3.question2.parser.ServerParser;

import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String filePath = "src/corejava/streamAPI/assignment3/question2/input/input.csv";

        ServerParser serverParser = new ServerParser();
        List<Server> serverList = serverParser.parseCSVFile(filePath);
       // serverList.forEach(System.out::println);

//1
        ServerList serverListObj = new ServerList();
        Set<String> allServer =  serverListObj.getServerList(serverList);
        allServer.forEach(System.out::println);

    }
}
