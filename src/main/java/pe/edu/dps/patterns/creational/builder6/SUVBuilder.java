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
  }

  @Override
  public void setSeats(Integer number) {
    String feature = suv.getFeature();
    this.suv.setFeature(feature + ", " + number + " seats");
  }

  @Override
  public void setEngine(String Engine) {
    String feature = suv.getFeature();
    this.suv.setFeature(feature + ", engine: 1.6");
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

  public SUV getResult() {
    return this.suv;
  }
}
