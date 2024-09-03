package pe.edu.dps.train.interfaces;

public class Airport {
  private String name;
  private String ciudad;
  private Flyer flyer;

  public Airport(Flyer flyer){
    this.flyer = flyer;
  }

  public void testing() {
    this.flyer.accionPropia();
  }

  public void accept(Flyer flyer) {
    flyer.land();
    flyer.accionPropia();
    flyer.detach();
  }
  public Flyer helping() {
    return new Airplane();
  }
}
