package pe.edu.dps.train.interfaces;

public class CargoAircraft implements Flyer {
  private String business;

  @Override
  public void land() {
    System.out.println("Aterizando Cargo Aircraft");
  }

  @Override
  public void detach() {
    System.out.println("Despegando Cargo Aircraft");
  }

  @Override
  public void accionPropia() {
    System.out.println("Cargando encomiendas u otros objetos");
    this.cargarEncomienda();
  }

  public void cargarEncomienda() {
    System.out.println("Utilizar el cargador y colocarlos en el avion");
  }
}
