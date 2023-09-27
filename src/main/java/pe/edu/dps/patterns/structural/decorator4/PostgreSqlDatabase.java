package pe.edu.dps.patterns.structural.decorator4;

public class PostgreSqlDatabase implements Database{
    @Override
    public void connect(String url) {
        System.out.println("Load Driver for PostreSql Database");
        System.out.println("Connect PostgreSql with " + url);
    }
}
