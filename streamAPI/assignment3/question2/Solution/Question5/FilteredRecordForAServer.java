package corejava.streamAPI.assignment3.question2.Solution.Question5;

import corejava.streamAPI.assignment3.question2.model.Server;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FilteredRecordForAServer {
    public List<Server> getFilteredRecordForServer(List<Server> serverList){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Server Name to get record");
        String st = sc.next();


        List<Server> serverData = serverList.stream().filter((e)->e.getServerName().equals(st)).collect(Collectors.toList());
        //serverData.forEach(System.out::println);
        return serverData;
    }

}
