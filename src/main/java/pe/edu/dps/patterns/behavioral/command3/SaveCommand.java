package pe.edu.dps.patterns.behavioral.command3;

public class SaveCommand implements Command{
  @Override
  public void execute() {
    System.out.println("Saved");
  }
}
