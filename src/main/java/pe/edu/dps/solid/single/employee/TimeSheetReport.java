package pe.edu.dps.solid.single.employee;

public class TimeSheetReport {

  public void print(Employee employee) {
    System.out.println(employee.getName() + " worked 40 hours.");
  }
}
