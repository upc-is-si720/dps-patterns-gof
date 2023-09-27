package pe.edu.dps.patterns.creational.factorymethod2;

public class WindowsButton implements Button{
  @Override
  public void render() {
    System.out.println("Render WindowsButton");
  }

  @Override
  public void onClick() {
    System.out.println("on Click WindowsButton");
  }
}
