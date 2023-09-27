package pe.edu.dps.patterns.structural.bridge3;

public class Client {
    public static void main(String[] args) {
        Database oracle = new OracleDatabase();
        Database mysql = new MySqlDatabase();

        Orm jpaOracle = new JpaOrm(oracle);
        Orm jpaMysql = new JpaOrm(mysql);
        Orm entityOracle = new EntityOrm(oracle);
        Orm entityMysql = new EntityOrm(mysql);

        runOrm(jpaOracle);
        runOrm(jpaMysql);
        runOrm(entityOracle);
        runOrm(entityMysql);
    }
    public static void runOrm(Orm orm) {
        orm.crear();
        orm.leer();
        orm.actualizar();
        orm.borrar();
    }
}








