package pe.edu.dps.patterns.behavioral.command3;

public class PrintCommand implements Command{
  @Override
  public void execute() {
    System.out.println("Printed");
  }
}
