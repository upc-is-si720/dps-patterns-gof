package pe.edu.dps.train.relations;

public class MainRelation {
  public static void main(String[] args) {

    Cat cat = new Cat(Color.WHITE);
    cat.makeSound();
    cat.move();

    Animal dog = new Dog();
    dog.makeSound();
    dog.move();

    Gatito gatito = new Gatito();

  }
}
