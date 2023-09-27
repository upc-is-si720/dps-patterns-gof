package pe.edu.dps.patterns.creational.builder;

public interface Builder {
    void buildBody();
    void insertWheels();
    void addHeadlights();
    Product getVehicle();
}
