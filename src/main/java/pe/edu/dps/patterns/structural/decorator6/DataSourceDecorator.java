package pe.edu.dps.patterns.structural.decorator6;

public class DataSourceDecorator implements DataSource {
  private final DataSource wrappee;

  public DataSourceDecorator(DataSource source) {
    this.wrappee = source;
  }

  @Override
  public void writeData(String data) {
    wrappee.writeData(data);
  }

  @Override
  public String readData() {
    return wrappee.readData();
  }
}
