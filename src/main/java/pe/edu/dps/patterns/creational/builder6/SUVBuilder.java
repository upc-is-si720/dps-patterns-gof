package pe.edu.dps.patterns.creational.builder6;

public class SUVBuilder implements Builder {

  private SUV suv;

  public SUVBuilder() {
    this.suv = new SUV();
    this.suv.setFeature("SUV");
  }
  @Override
  public void reset() {
    System.out.println("Resetting");
    this.suv = new SUV();
    this.suv.setFeature("SUV");
  }

  @Override
  public void setSeats(Integer number) {
    String feature = suv.getFeature();
    this.suv.setFeature(feature + ", " + number + " seats");
  }

  @Override
  public void setEngine(String engine) {
    String feature = suv.getFeature();
    this.suv.setFeature(feature + ", engine: " + engine);
  }

  @Override
  public void setTripComputer() {
    String feature = suv.getFeature();
    this.suv.setFeature(feature + ", computer: SI");
  }

  @Override
  public void setGPS() {
    String feature = suv.getFeature();
    this.suv.setFeature(feature + ", gps: NO");
  }

  public SUV getProduct() {
    return this.suv;
  }
}
