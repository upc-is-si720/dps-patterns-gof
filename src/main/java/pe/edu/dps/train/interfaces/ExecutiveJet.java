package pe.edu.dps.train.interfaces;

public class ExecutiveJet implements Flyer {
  private String model;
  private int capacity;
  private String country;

  @Override
  public void land() {
    System.out.println("Aterrizando Executive Jet ...");
  }

  @Override
  public void detach() {
    System.out.println("Despegando Executive Jet ...");
  }

  @Override
  public void accionPropia() {
    System.out.println("Service VIP");
  }
}
