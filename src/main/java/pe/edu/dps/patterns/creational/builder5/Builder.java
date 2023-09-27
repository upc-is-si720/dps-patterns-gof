package pe.edu.dps.patterns.creational.builder5;

public interface Builder {
    void buildWall();
    void buildDoor();
    void buildWindow();
    House getResult();

}
