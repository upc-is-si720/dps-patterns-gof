package pe.edu.dps.solid.liskov;

public class WritableDocument extends Document {

  public WritableDocument(String filename) {
    super(filename);
  }

  public void save() {
    System.out.println("Saving document " + this.getFilename());
  }
}
