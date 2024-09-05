package pe.edu.dps.patterns.creational.builder6;

public interface Builder {
  void reset();
  void setSeats(Integer number);
  void setEngine(String engine);
  void setTripComputer();
  void setGPS();
}
