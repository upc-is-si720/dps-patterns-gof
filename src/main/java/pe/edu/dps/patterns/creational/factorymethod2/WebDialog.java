package pe.edu.dps.patterns.creational.factorymethod2;

public class WebDialog extends Dialog {
  @Override
  public Button createButton() {
    return new HtmlButton();
  }
}
