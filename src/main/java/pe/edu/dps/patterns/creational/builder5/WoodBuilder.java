package pe.edu.dps.patterns.creational.builder5;

public class WoodBuilder implements Builder {
    private House house;

    public WoodBuilder() {
        house = new House();
        house.setMaterial("Wood");
    }
    @Override
    public House getResult() {
        return house;
    }
    @Override
    public void buildWall() {
        System.out.println("Build Wood Wall");
    }

    @Override
    public void buildDoor() {
        System.out.println("Build Wood Door");
    }

    @Override
    public void buildWindow() {
        System.out.println("Build Wood Window");
    }
}
