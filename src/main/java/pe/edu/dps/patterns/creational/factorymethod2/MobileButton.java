package pe.edu.dps.patterns.creational.factorymethod2;

public class MobileButton implements Button{
  @Override
  public void render() {
    System.out.println("render MobileButton");
  }

  @Override
  public void onClick() {
    System.out.println("onCLick MobileButton");
  }
}
