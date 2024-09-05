package pe.edu.dps.solid.dependencyinversion.service;

import java.util.Date;

public class BudgetReport {
  private final Database database;  // interface

  // Dependency Injection
  public BudgetReport(Database database) {
    this.database = database;
  }

  public void open(Date date) {
    this.database.connect();
    System.out.println("Open report");
  }

  public void save() {
    System.out.println("Save report");
    this.database.insert();
    this.database.disconnect();
  }
}
