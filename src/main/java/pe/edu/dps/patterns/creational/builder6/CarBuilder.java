package pe.edu.dps.patterns.creational.builder6;

public class CarBuilder implements Builder {
    private Car car;
    private String brand;

    public CarBuilder(String brand) {
        this.car = new Car(brand);
        this.brand = brand;
    }

    @Override
    public void reset() {
        System.out.println("Clears the object car");
        this.car = new Car(this.brand);
    }

    @Override
    public void setSeats(Integer number) {
        System.out.println("Set the number of seats in the car.");
        this.car.setSeat(number);
    }

    @Override
    public void setEngine(String engine) {
        System.out.println("Install a given engine");
        this.car.setEngine(engine);
    }

    @Override
    public void setTripComputer() {
        System.out.println("Install a trip computer.");
        this.car.setTripComputer("Si");
    }

    @Override
    public void setGPS() {
        System.out.println("Install a global positioning system.");
        this.car.setGps("No");
    }

    public Car getProduct() {
        return this.car;
    }
}
