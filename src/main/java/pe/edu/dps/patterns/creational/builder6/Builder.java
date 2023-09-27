package pe.edu.dps.patterns.creational.builder6;

public interface Builder {
  void reset();
  void setSeats(Integer number);
  void setEngine(String Engine);
  void setTripComputer();
  void setGPS();
}
