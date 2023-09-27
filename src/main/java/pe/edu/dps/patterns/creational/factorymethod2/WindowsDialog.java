package pe.edu.dps.patterns.creational.factorymethod2;

public class WindowsDialog extends Dialog{
  @Override
  public Button createButton() {
    return new WindowsButton();
  }
}
