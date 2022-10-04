package corejava.streamAPI.assignment3.question2.Solution.Question6;

import corejava.streamAPI.assignment3.question2.model.Server;

import java.util.Comparator;

public class ApplicationVersionComparator implements Comparator<String> {


    @Override
    public int compare(String version1, String version2) {
        return version1.compareTo(version2);
    }
}
