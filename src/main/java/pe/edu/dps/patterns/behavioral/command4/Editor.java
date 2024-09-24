package pe.edu.dps.patterns.behavioral.command4;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Editor {
  private String text;

  public String getSelection() {
    return this.text;
  }

  public void deleteSelection() {
    this.text = "";
  }

  public void replaceSelection(String text) {
    this.text = text;
  }
}
