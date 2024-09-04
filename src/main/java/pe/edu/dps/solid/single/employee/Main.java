package pe.edu.dps.solid.single.employee;

public class Main {
  public static void main(String[] args) {
    Employee employee = new Employee("John Doe");
    TimeSheetReport timeSheetReport = new TimeSheetReport();
    timeSheetReport.print(employee);
  }
}
