package pe.edu.dps.patterns.creational.factorymethod2;

public class MobileDialog extends Dialog {
  @Override
  public Button createButton() {
    return new MobileButton();
  }
}
