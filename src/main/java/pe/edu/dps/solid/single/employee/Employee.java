package pe.edu.dps.solid.single.employee;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Employee {
  private String name;

  Employee(String name) {
    this.name = name;
  }
}
