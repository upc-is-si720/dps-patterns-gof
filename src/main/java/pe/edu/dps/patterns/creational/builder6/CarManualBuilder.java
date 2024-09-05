package pe.edu.dps.patterns.creational.builder6;

public class CarManualBuilder implements Builder{
    private CarManual manual;

    public CarManualBuilder() {
        this.manual = new CarManual();
    }

    @Override
    public void reset() {
        System.out.println("Clears the object car");
        this.manual = new CarManual();
    }

    @Override
    public void setSeats(Integer number) {
        System.out.println("Document car seat features.");
        this.manual.setSeat(number);
    }

    @Override
    public void setEngine(String engine) {
        System.out.println("Add engine instructions.");
        this.manual.setEngine(engine);
    }

    @Override
    public void setTripComputer() {
        System.out.println("Add trip computer instructions.");
    }

    @Override
    public void setGPS() {
        System.out.println("Add GPS instructions.");
    }

    public CarManual getProduct() {
        this.manual.setCover("Car Manual");
        this.manual.setContent("Content of car manual");
        return this.manual;
    }
}
