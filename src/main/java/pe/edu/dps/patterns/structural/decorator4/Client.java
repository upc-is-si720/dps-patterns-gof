package pe.edu.dps.patterns.structural.decorator4;

public class Client {
    public static void main(String[] args) {
        Database oracle = new OracleDatabase();
        Database sqlServer = new SqlServerDatabase();
        Database postgreSql = new PostgreSqlDatabase();
        Database mongoDb = new MongoDbDatabase();
        Database cassandra = new CassandraDatabase();
        Database new4J = new Neo4JDatabase();

        oracle.connect("jdbc:oracle://localhost:1521/patrones");
        sqlServer.connect("jdbc:sqlserver://localhost:1433/patrones");
        postgreSql.connect("jdbc:postgresql://localhost:5432/patrones");
        mongoDb.connect("jdbc:mongodb://localhost:27017/patrones");
        cassandra.connect("jdbc:cassandra://localhost:7000/patrones");
        new4J.connect("jdbc:neo4j://localhost:6362/patrones");
    }
}
