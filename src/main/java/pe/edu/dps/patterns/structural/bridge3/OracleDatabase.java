package pe.edu.dps.patterns.structural.bridge3;

public class OracleDatabase implements Database {
    @Override
    public void create() {
        System.out.println("Insert into table - ORACLE");
    }
    @Override
    public void read() {
        System.out.println("Select * from table - ORACLE");
    }
    @Override
    public void update() {
        System.out.println("Update Table Set field - ORACLE ");
    }
    @Override
    public void delete() {
        System.out.println("Delete from table - ORACLE");
    }
}
