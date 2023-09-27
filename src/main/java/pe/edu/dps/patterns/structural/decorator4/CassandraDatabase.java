package pe.edu.dps.patterns.structural.decorator4;

public class CassandraDatabase extends DecoratorDatabase{
    @Override
    public void connect(String url) {
        System.out.println("Load Driver for Cassandra");
        this.setNoSql("Graph");
        System.out.println("Connect Cassandra with " + url);
    }
    @Override
    public void setNoSql(String noSql) {
        System.out.println("Set " + noSql + " for noSql Database");
    }
}
