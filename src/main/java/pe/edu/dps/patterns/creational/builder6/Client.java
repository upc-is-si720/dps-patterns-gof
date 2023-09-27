package pe.edu.dps.patterns.creational.builder6;

public class Client {
  private static Director director;

  public static void main(String[] args) {
    AutoBuilder autoBuilder = new AutoBuilder();
    SUVBuilder suvBuilder = new SUVBuilder();

    director = new Director(autoBuilder);
    director.make("auto");
    Auto auto = autoBuilder.getResult();
    System.out.println(auto.getFeature());

    director.changeBuilder(autoBuilder);
    director.changeBuilder(suvBuilder);
    director.changeBuilder(autoBuilder);
    director.changeBuilder(suvBuilder);
    director.make("SUV");
    SUV suv = suvBuilder.getResult();
    System.out.println(suv.getFeature());
  }
}
