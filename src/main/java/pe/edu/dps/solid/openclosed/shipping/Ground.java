package pe.edu.dps.solid.openclosed.shipping;

import java.util.Date;

public class Ground implements Shipping {
  @Override
  public float getCost(Order order) {
    return 0;
  }

  @Override
  public Date getDate(Order order) {
    return null;
  }
}
