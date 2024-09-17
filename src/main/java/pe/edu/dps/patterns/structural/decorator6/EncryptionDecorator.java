package pe.edu.dps.patterns.structural.decorator6;

public class EncryptionDecorator extends DataSourceDecorator {
  public EncryptionDecorator(DataSource source) {
    super(source);
  }

  @Override
  public void writeData(String data) {
    System.out.println("Encrypting data: " + data);
    super.writeData(data);
  }

  @Override
  public String readData() {
    String data = super.readData();
    System.out.println("Decrypting data: " + data);
    return data;
  }
}
