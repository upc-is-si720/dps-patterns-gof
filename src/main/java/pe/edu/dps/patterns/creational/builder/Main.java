package pe.edu.dps.patterns.creational.builder;

public class Main {

    public static void main(String[] args) {
        System.out.println("***Builder Pattern Demo***");

        Director director = new Director();

        Builder carBuilder = new Car();
        Builder motorBuilder = new MotorCycle();
        Builder airBuilder = new Airplain();

        // Making Car
        director.construct(carBuilder);
        Product p1 = carBuilder.getVehicle();
        p1.show();

        //Making MotorCycle
        director.construct(motorBuilder);
        Product p2 = motorBuilder.getVehicle();
        p2.show();

        //Making Airplane
        director.construct(airBuilder);
        Product p3 = airBuilder.getVehicle();
        p3.show();
    }
}
