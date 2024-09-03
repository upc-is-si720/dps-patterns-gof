package pe.edu.dps.solid.openclosed.shipping;

import java.util.Date;
import java.util.List;

public class Order {
  private List<String> lineItems;
  private final Shipping shipping;

  // Dependency Injection
  // Cuando se reeemplaza una Interfaz por un objeto de una clase
  public Order(Shipping shipping) {
    this.shipping = shipping;
  }
  public float getTotal() {
    return 0;
  }
  public float getTotalWeight() {
    return 0;
  }
  public String getShippingType(Shipping shipping) {
    return null;
  }
  public float getShippingCost() {
    return shipping.getCost(this);
  }
  public Date getShippingDate() {
    return shipping.getDate(this);
  }
}
