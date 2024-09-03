package pe.edu.dps.solid.openclosed.shipping;

import java.util.Date;

public interface Shipping {
  float getCost(Order order);
  Date getDate(Order order);
}
