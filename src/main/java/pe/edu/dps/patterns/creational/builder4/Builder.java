package pe.edu.dps.patterns.creational.builder4;

public class Builder {
    private House house;

    public Builder(){
        house = new House();
    }
    public Builder wall(String wall) {
        house.setWall(wall);
        return this;
    }
    public Builder door(String door) {
        house.setDoor(door);
        return this;
    }
    public Builder garage(String garage) {
        house.setGarage(garage);
        return this;
    }
    // todos los atributos

    public House builder() {
        return this.house;
    }
}
