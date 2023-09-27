package pe.edu.dps.patterns.structural.decorator4;

public class Neo4JDatabase extends DecoratorDatabase{
    @Override
    public void connect(String url) {
        System.out.println("Load Driver for Neo4J");
        this.setNoSql("Key-value");
        System.out.println("Connect Neo4J with " + url);
    }
    @Override
    public void setNoSql(String noSql) {
        System.out.println("Set " + noSql + " for noSql Database");
    }
}
