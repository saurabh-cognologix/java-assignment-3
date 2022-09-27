package corejava.streamAPI.assignment3.question2.Solution.Question4;

import corejava.streamAPI.assignment3.question2.model.Server;

import java.util.List;
import java.util.stream.Collectors;

public class DistinctServerName {
    public List<String> getDistinctServerName(List<Server> serverList){
        List<String> distinctServerList = serverList.stream().map((e)->e.getServerName()).distinct().collect(Collectors.toList());
       // distinctServerList.forEach(System.out::println);
        return distinctServerList;
    }
}
