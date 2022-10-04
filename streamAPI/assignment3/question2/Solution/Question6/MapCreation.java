package corejava.streamAPI.assignment3.question2.Solution.Question6;

import corejava.streamAPI.assignment3.question1.model.Student;
import corejava.streamAPI.assignment3.question2.model.Server;

import java.util.*;
import java.util.stream.Collectors;


public class MapCreation {
    public Map<String,Set<String>> getSortedSetOfSoftware(List<Server> serverList){
        Map<String,Set<String>> applicationVersionName = serverList.stream()
                .collect(Collectors.toMap(
                        Server::getApplicationName,
                        server -> {
                            Set<String> versions = new TreeSet<>(new ApplicationVersionComparator());
                            versions.add(server.getVersion());
                            return versions;
                        },
                        (prev,current)->{
                            prev.addAll(current);
                            return prev;
                        }
                ));

        //applicationVersionName.forEach((appicationName,sortedVersion)-> System.out.println(appicationName+" : "+sortedVersion));

        return applicationVersionName;
    }
}
