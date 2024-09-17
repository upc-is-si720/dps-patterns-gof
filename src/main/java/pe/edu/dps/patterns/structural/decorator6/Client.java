package pe.edu.dps.patterns.structural.decorator6;

public class Client {
  public static void main(String[] args) {
    DataSource dataSource = new FileDataSource("file.txt");
    dataSource.writeData("data");
    System.out.println("FileDataSource: " + dataSource.readData());

    DataSource encrypted = new EncryptionDecorator(dataSource);
    encrypted.writeData("data");
    System.out.println("EncryptionDecorator: " + dataSource.readData());

    DataSource compressed = new CompressionDecorator(dataSource);
    compressed.writeData("data");
    System.out.println("CompressionDecorator: " + dataSource.readData());

    DataSource encryptedAndCompressed = new CompressionDecorator(new EncryptionDecorator(dataSource));
    encryptedAndCompressed.writeData("data");
    System.out.println("CompressionDecorator: " + dataSource.readData());
  }
}
