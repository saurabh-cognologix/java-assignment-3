package corejava.streamAPI.assignment3.question2.Solution.Question2;

import corejava.streamAPI.assignment3.question1.model.Student;
import corejava.streamAPI.assignment3.question2.model.Server;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedServerName {
    public List<Server> sortedByServerName(List<Server> serverList){
        List<Server> sortedServerList = serverList.stream()
                .sorted(Comparator.comparing(Server::getServerName))
                .collect(Collectors.toList());

        return sortedServerList;
    }
}
