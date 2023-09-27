package pe.edu.dps.patterns.creational.singleton2;

public class Database {
  private static Database instance;
  private Database() {
  }
  public static Database getInstance() {
    if (Database.instance == null) {
      Database.instance = new Database();
      System.out.println("Database connected ...!");
    }
    return Database.instance;
  }
  public void query(String sql) {
    System.out.println("Execute: " + sql);
  }

}
