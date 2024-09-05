package pe.edu.dps.patterns.creational.builder6;

public class OtherDirector {
    public void makeCarManual(Builder builder) {
        builder.reset();
        builder.setSeats(4);
        builder.setEngine("Mechanic");
        builder.setTripComputer();
        builder.setGPS();
    }
    public void constructSportCar(Builder builder) {
        builder.reset();
        builder.setSeats(2);
        builder.setEngine("Sport");
        builder.setTripComputer();
        builder.setGPS();
    }
    public void constructSuv(Builder builder) {
        builder.reset();
        builder.setSeats(4);
        builder.setEngine("Automatic");
        builder.setTripComputer();
        builder.setGPS();
    }
}
