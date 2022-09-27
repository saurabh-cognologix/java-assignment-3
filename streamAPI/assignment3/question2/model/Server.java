package corejava.streamAPI.assignment3.question2.model;

public class Server {
    private String serverName;
    private String typesOfApplication;
    private String applicationName;
    private String version;

    public Server(String serverName, String typesOfApplication, String applicationName, String version) {
        this.serverName = serverName;
        this.typesOfApplication = typesOfApplication;
        this.applicationName = applicationName;
        this.version = version;
    }

    public Server() {
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public String getTypesOfApplication() {
        return typesOfApplication;
    }

    public void setTypesOfApplication(String typesOfApplication) {
        this.typesOfApplication = typesOfApplication;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        String placeHoder = "Server Name :{0} ,Types Of Application :{1}, Application Name: {2},Version :{3}";
        return java.text.MessageFormat.format(placeHoder,serverName,typesOfApplication,applicationName,version);
    }
}
