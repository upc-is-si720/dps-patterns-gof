package pe.edu.dps.patterns.behavioral.command3;

public class OpenCommand implements Command {
  @Override
  public void execute() {
    System.out.println("Openned");
  }
}
