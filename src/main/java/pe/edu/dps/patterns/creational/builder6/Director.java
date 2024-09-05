package pe.edu.dps.patterns.creational.builder6;

public class Director {
  private Builder builder;

  public Director(Builder builder) {
    this.builder = builder;
  }

  public void changeBuilder(Builder builder) {
    this.builder = builder;
  }

  public void make(String type) {
    builder.reset();
    if (type.equals("manual")) {
      builder.setSeats(4);
      builder.setEngine("1.6");
      builder.setTripComputer();
    } else if (type.equals("automatic")) {
      builder.setSeats(4);
      builder.setEngine("1.2");
    } else  {
      builder.setSeats(4);
      builder.setEngine("2.0");
      builder.setTripComputer();
    }
  }

}
