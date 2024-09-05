package pe.edu.dps.solid.dependencyinversion.repository;

import pe.edu.dps.solid.dependencyinversion.service.Database;

public class MongoDb implements Database {
    @Override
    public void connect() {
        System.out.println("Connecting to MongoDB");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting from MongoDB");
    }

    @Override
    public void insert() {
        System.out.println("Inserting in MongoDB");
    }

    @Override
    public void update() {
        System.out.println("Updating in MongoDB");
    }

    @Override
    public void delete() {
        System.out.println("Deleting in MongoDB");
    }
}
