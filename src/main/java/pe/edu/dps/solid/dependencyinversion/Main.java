package pe.edu.dps.solid.dependencyinversion;

import java.time.LocalDate;
import java.util.Calendar;

public class Main  {
  public static void main(String[] args) {
    MySql mySql = new MySql();
    BudgetReport budgetReport = new BudgetReport(mySql);
    budgetReport.open(Calendar.getInstance().getTime());
    budgetReport.save();
  }
}
