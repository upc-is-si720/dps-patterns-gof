package pe.edu.dps.patterns.creational.singleton2;

public class Application {
  public static void main(String[] args) {
    Database foo = Database.getInstance();
    System.out.println(foo);
    foo.query("SELECT * FROM Student");

    Database bar = Database.getInstance();
    System.out.println(bar);
    bar.query("CREATE TABLE career ...");

    Database aos = Database.getInstance();
    System.out.println(aos);
    aos.query("INSERT INTO faculty (...)");
  }
}
