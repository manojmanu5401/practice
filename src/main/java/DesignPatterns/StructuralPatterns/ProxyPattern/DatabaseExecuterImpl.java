package DesignPatterns.StructuralPatterns.ProxyPattern;

public class DatabaseExecuterImpl implements DatabaseExecuter{
    public void executeDatabase(String query) throws Exception {
        System.out.println("Going to execute Query: " + query);
    }
}
