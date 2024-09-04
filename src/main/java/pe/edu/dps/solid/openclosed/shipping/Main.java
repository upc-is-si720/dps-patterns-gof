package pe.edu.dps.solid.openclosed.shipping;

public class Main {
  public static void main(String[] args) {
    // Injección de dependencia
    // Cuando se reeemplaza una Interfaz por una clase
    Order order = new Order(new Ground());
    System.out.println(order.getShippingDate());
  }
}
