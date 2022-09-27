package corejava.streamAPI.assignment3.question2.Solution.Question1;

import corejava.streamAPI.assignment3.question2.model.Server;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class ServerList {
    public Set<String> getServerList(List<Server> serverList){
        Set<String> allServerList = new HashSet<>();
        for(Server server : serverList){
            allServerList.add(server.getServerName());
        }
        return allServerList;
    }
}
