package pe.edu.dps.solid.liskov;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Document {
  private String data;
  private String filename;

  public Document(String filename) {
    this.filename = filename;
  }

  public void open() {
    System.out.println("Opening document " + this.filename);
  }
}
