package pe.edu.dps.patterns.behavioral.command3;

public class Shortcut {
  private Command command;
  public Shortcut(Command command) {
    this.command = command;
  }
  public void action() {
    this.command.execute();
  }
}
