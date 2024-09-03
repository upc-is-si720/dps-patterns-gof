package pe.edu.dps.train.relations;

// Clase hija o derivada
// final
//  - class: Hace que la clase no sea heredable
//  - attributes: el atributo se vuelve en Constante
public final class Cat extends Animal {
  private final Color COLOR;

  public Cat(Color color) {
    this.COLOR = color;
  }

  @Override
  public void makeSound() {
    System.out.println("Meow");
  }
}
