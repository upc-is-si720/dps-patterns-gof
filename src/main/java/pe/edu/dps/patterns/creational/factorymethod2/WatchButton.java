package pe.edu.dps.patterns.creational.factorymethod2;

public class WatchButton implements Button {
  @Override
  public void render() {
    System.out.println("render WatchButton");
  }

  @Override
  public void onClick() {
    System.out.println("onClick WatchButton");
  }
}
