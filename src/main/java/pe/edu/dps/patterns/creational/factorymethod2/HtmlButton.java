package pe.edu.dps.patterns.creational.factorymethod2;

public class HtmlButton implements Button{
  @Override
  public void render() {
    System.out.println("Render HtmlButton");
  }

  @Override
  public void onClick() {
    System.out.println("onClick HtmlButton");
  }
}
