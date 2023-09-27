package pe.edu.dps.patterns.structural.decorator4;

public class MongoDbDatabase extends DecoratorDatabase{
    @Override
    public void connect(String url) {
        System.out.println("Load Driver for MongoDB");
        this.setNoSql("Document");
        System.out.println("Connect MongoDB with " + url);
    }
    @Override
    public void setNoSql(String noSql) {
        System.out.println("Set " + noSql + " for noSql Database");
    }
}
