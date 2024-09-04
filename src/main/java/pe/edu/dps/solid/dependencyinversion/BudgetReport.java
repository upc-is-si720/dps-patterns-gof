package pe.edu.dps.solid.dependencyinversion;

import java.util.Date;

public class BudgetReport {
  private final Database database;

  public BudgetReport(Database database) {
    this.database = database;
  }

  public void open(Date date) {
    database.connect();
    System.out.println("Open report");
  }

  public void save() {
    System.out.println("Save report");
    database.insert();
  }
}
