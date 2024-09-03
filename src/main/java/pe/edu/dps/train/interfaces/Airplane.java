package pe.edu.dps.train.interfaces;

public class Airplane implements Flyer {
  private String model;

  @Override
  public void land() {
    System.out.println("Aterrizando Airplane ...");
  }

  @Override
  public void detach() {
    System.out.println("Despegando Airplane ...");
  }

  @Override
  public void accionPropia() {
    System.out.println("Suben pasajeron y cumple protocolo");
  }
}
