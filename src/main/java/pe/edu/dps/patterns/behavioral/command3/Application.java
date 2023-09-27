package pe.edu.dps.patterns.behavioral.command3;

public class Application {
  public static void main(String[] args) {
    Command save = new SaveCommand();
    Command open = new OpenCommand();
    Command print = new PrintCommand();

    Button saveButton = new Button(save);
    Shortcut cmdS = new Shortcut(save);

    saveButton.onClick();
    cmdS.action();

  }
}
