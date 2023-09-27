package pe.edu.dps.patterns.creational.factorymethod2;

public class Application {
  private Dialog dialog;
  public void initialize() {
    String os = readApplicationOS();
    if (os.equals("Windows")) {
      dialog = new WindowsDialog();
    } else if (os.equals("Web")) {
      dialog = new WebDialog();
    } else if (os.equals("Mobile")) {
      dialog = new MobileDialog();
    }
  }
  public void main() {
    this.initialize();
    dialog.render();
  }
  public String readApplicationOS() {
    return "Mobile";
  }
}
