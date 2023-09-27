package pe.edu.dps.patterns.creational.builder5;

public class StoneBuilder implements Builder{

    private House house;

    public StoneBuilder() {
        house = new House();
        house.setMaterial("Stone");
    }
    @Override
    public House getResult() {
        return house;
    }
    @Override
    public void buildWall() {
        System.out.println("Build stone Wall");
    }

    @Override
    public void buildDoor() {
        System.out.println("Build stone Door");
    }

    @Override
    public void buildWindow() {
        System.out.println("Build stone Window");
    }
}
