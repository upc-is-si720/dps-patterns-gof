package pe.edu.dps.patterns.creational.builder6;

public class AutoBuilder implements Builder {
  private Auto auto;

  public AutoBuilder() {
    this.auto = new Auto();
    this.auto.setFeature("AUTO");
  }
  @Override
  public void reset() {
    System.out.println("Resetting");
    this.auto = new Auto();
    this.auto.setFeature("AUTO");
  }

  @Override
  public void setSeats(Integer number) {
    String feature = auto.getFeature();
    this.auto.setFeature(feature + ", " + number + " seats");
  }

  @Override
  public void setEngine(String engine) {
    String feature = auto.getFeature();
    this.auto.setFeature(feature + ", engine: " + engine);
  }

  @Override
  public void setTripComputer() {
    String feature = auto.getFeature();
    this.auto.setFeature(feature + ", computer: no tiene");
  }

  @Override
  public void setGPS() {
    String feature = auto.getFeature();
    this.auto.setFeature(feature + ", gps: no tiene");
  }

  public Auto getProduct() {
    return this.auto;
  }
}
