package pe.edu.dps.patterns.structural.decorator4;

public class OracleDatabase implements Database{
    @Override
    public void connect(String url) {
        System.out.println("Load Driver for Oracle Database");
        System.out.println("Connect Oracle with " + url);
    }
}
