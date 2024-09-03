package pe.edu.dps.train.relations;

// Clase base o padre
// abstract
//   - class: Hace que la clase no se pueda instanciar
//   - method: Permite la definición y obliga a la clase hija su implementación
public abstract class Animal {
  private String name;
  private String breed;

  public abstract void makeSound();

  public void move() {
    System.out.println("Caminando");
  }

}
