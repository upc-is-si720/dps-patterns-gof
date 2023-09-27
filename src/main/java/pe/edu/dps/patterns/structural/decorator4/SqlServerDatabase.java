package pe.edu.dps.patterns.structural.decorator4;

public class SqlServerDatabase implements Database{
    @Override
    public void connect(String url) {
        System.out.println("Load Driver for SqlServer Database");
        System.out.println("Connect SqlServer with " + url);
    }
}
