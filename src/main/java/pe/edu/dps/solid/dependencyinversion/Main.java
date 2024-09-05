package pe.edu.dps.solid.dependencyinversion;

import pe.edu.dps.solid.dependencyinversion.repository.MongoDb;
import pe.edu.dps.solid.dependencyinversion.repository.MySql;
import pe.edu.dps.solid.dependencyinversion.service.BudgetReport;

import java.util.Calendar;

public class Main  {
  public static void main(String[] args) {
    MySql mySql = new MySql();
    MongoDb mongoDb = new MongoDb();
    BudgetReport budgetReport = new BudgetReport(mongoDb);
    budgetReport.open(Calendar.getInstance().getTime());
    budgetReport.save();
  }
}
