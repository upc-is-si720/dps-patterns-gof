package pe.edu.dps.patterns.creational.prototype;

public class Application {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        rectangle.setX(10);
        rectangle.setY(10);
        rectangle.setColor("Azul");
        rectangle.setHeight(10);
        rectangle.setWidth(20);
        rectangle.view();

        Rectangle two = rectangle;  // los 2 objetos son lo mismo
        System.out.println(two);
        two.view();

        Rectangle other = new Rectangle(rectangle);
        System.out.println(other);
        other.view();

        Rectangle one = rectangle.clone();
        System.out.println(one);
        one.view();
    }
}
