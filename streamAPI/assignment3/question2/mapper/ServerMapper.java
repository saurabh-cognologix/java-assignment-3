package corejava.streamAPI.assignment3.question2.mapper;

import corejava.streamAPI.assignment3.question2.model.Server;

public class ServerMapper {
    public static Server map(String data){
        String[] arr = data.split(", ");
        String serverName = arr[0].trim();
        String typesOfApplication = arr[1].trim();
        String applicationName = arr[2].trim();
        String version = arr[3].trim();
        Server server = new Server(serverName,typesOfApplication,applicationName,version);
        return server;
    }
}
