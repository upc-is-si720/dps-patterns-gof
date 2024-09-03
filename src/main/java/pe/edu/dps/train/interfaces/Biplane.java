package pe.edu.dps.train.interfaces;

public class Biplane implements Flyer {
  private String name;

  @Override
  public void land() {
    System.out.println("Biplane aterrizo");
  }

  @Override
  public void detach() {
    System.out.println("Biplane Despegando");
  }

  @Override
  public void accionPropia() {
    this.cargarCombustible();
    this.revisionTecnica();
  }
  public void cargarCombustible() {
    System.out.println("Cargando combustible");
  }
  public void revisionTecnica() {
    System.out.println("Revisando ...");
  }
}
