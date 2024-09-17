package pe.edu.dps.patterns.structural.decorator6;

import lombok.AllArgsConstructor;


public class FileDataSource implements DataSource {

  private final String filename;
  private String data;

  public FileDataSource(String filename) {
    this.filename = filename;
    this.data = "";
  }

  @Override
  public void writeData(String data) {
    this.data += data;
    System.out.println("Write data: " + data);
    System.out.println("to file: " + this.filename);
  }

  @Override
  public String readData() {
    return this.data;
  }
}
