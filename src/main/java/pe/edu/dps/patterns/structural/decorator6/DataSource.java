package pe.edu.dps.patterns.structural.decorator6;

public interface DataSource {
  void writeData(String data);
  String readData();
}
