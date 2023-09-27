package pe.edu.dps.patterns.structural.bridge3;

public class MySqlDatabase implements Database {
    @Override
    public void create() {
        System.out.println("Insert into table - MySQL");
    }
    @Override
    public void read() {
        System.out.println("Select * from table - MySQL");
    }
    @Override
    public void update() {
        System.out.println("Update Table Set field - MySQL");
    }
    @Override
    public void delete() {
        System.out.println("Delete from table - MySQL");
    }
}
