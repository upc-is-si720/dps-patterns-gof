package pe.edu.dps.patterns.behavioral.command4;

public class UndoCommand extends Command {
  public UndoCommand(Application application, Editor editor) {
    super(application, editor);
  }

  @Override
  public boolean execute() {
    this.application.undo();
    return false;
  }
}
