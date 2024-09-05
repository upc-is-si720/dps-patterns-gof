package pe.edu.dps.patterns.creational.builder6;

public class Client {

  public static void main(String[] args) {

    System.out.println("-----Director Example-----------------------------");
    // Director Example
    Director director;
    AutoBuilder autoBuilder = new AutoBuilder();
    SUVBuilder suvBuilder = new SUVBuilder();

    director = new Director(autoBuilder);
    director.make("manual");
    Auto auto = autoBuilder.getProduct();
    System.out.println(auto.getFeature());

    System.out.println("----------------------------------");

    director.changeBuilder(suvBuilder);
    director.make("automatic");
    SUV suv = suvBuilder.getProduct();
    System.out.println(suv.getFeature());

    System.out.println("---------Other Director Example-------------------------");
    // Other Director Example
    OtherDirector otherDirector = new OtherDirector();
    CarBuilder carBuilder = new CarBuilder("Hyunday");
    otherDirector.constructSportCar(carBuilder);
    Car car = carBuilder.getProduct();
    System.out.println(car);

    System.out.println("----------------------------------");

    CarManualBuilder carManualBuilder = new CarManualBuilder();
    otherDirector.makeCarManual(carManualBuilder);
    CarManual carManual = carManualBuilder.getProduct();
    System.out.println(carManual);

  }
}
