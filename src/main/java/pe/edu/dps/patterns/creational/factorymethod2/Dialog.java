package pe.edu.dps.patterns.creational.factorymethod2;

public abstract class Dialog {
  public void render() {
    Button okButton = this.createButton();
    okButton.onClick();
    okButton.render();
  }
  public abstract Button createButton();
}
