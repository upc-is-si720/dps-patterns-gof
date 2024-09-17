package pe.edu.dps.patterns.structural.decorator6;

public class CompressionDecorator extends DataSourceDecorator {
  public CompressionDecorator(DataSource source) {
    super(source);
  }

  @Override
  public void writeData(String data) {
    System.out.println("Compressing data: " + data);
    super.writeData(data);
  }

  @Override
  public String readData() {
    String data = super.readData();
    System.out.println("Decompressing data: " + data);
    return data;
  }
}
