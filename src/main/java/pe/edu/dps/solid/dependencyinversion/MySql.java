package pe.edu.dps.solid.dependencyinversion;

public class MySql implements Database {
    @Override
    public void connect() {
        System.out.println("Connecting to MySQL");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting from MySQL");
    }

    @Override
    public void insert() {
        System.out.println("Inserting in MySQL");
    }

    @Override
    public void update() {
        System.out.println("Updating in MySQL");
    }

    @Override
    public void delete() {
        System.out.println("Deleting in MySQL");
    }
}
