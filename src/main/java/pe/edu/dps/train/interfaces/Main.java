package pe.edu.dps.train.interfaces; // lower dot case

public class Main { // Upper Camel Case
  public static void main(String[] args) {
    System.out.println("Hello Developers");

    Airport airport = new Airport(new Biplane());
    Airplane airplane = new Airplane();
    ExecutiveJet executiveJet = new ExecutiveJet();
    CargoAircraft cargoAircraft = new CargoAircraft();
    Biplane biplane = new Biplane();
    // 1. Declaración
    Airplane airplane1;
    //2. Instanciación, contrucción,
    airplane1 = new Airplane();

    // 1. Declaración
    Flyer flyer;
    // 2. Instanciación
    flyer = new CargoAircraft();


    airport.accept(cargoAircraft);
    airport.accept(biplane);
    airport.accept(airplane);
    airport.accept(executiveJet);

    airport.testing();

  }
}
