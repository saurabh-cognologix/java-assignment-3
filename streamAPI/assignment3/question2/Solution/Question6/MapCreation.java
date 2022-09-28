package corejava.streamAPI.assignment3.question2.Solution.Question6;

import corejava.streamAPI.assignment3.question1.model.Student;
import corejava.streamAPI.assignment3.question2.model.Server;

import java.util.*;
import java.util.stream.Collectors;


public class MapCreation {
    public void getSortedSetOfSoftware(List<Server> serverList){
        Map<String, TreeSet<String>> tempMap = new HashMap<>();

        for(Server server : serverList){
             String applicationName = server.getApplicationName();
             String version = server.getVersion();
             TreeSet<String> versionTreeSet = new TreeSet<>();
             //versionTreeSet.add(version);
            // tempMap.put(applicationName,versionTreeSet);
             if(tempMap.containsKey(applicationName)){
                 versionTreeSet.add(version);
                  tempMap.put(applicationName,versionTreeSet);
             }else if(!tempMap.containsKey(applicationName)){
                 versionTreeSet.add(version);
                 tempMap.put(applicationName,versionTreeSet);
             }
        }


        tempMap.forEach((k,v)-> System.out.println(k+" :  "+v));
    }
}
