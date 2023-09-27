package pe.edu.dps.patterns.behavioral.command3;

public class Button {
  private Command command;
  public Button(Command command) {
    this.command = command;
  }

  public void onClick() {
    this.command.execute();
  }
}
