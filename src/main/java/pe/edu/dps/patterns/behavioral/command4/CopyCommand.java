package pe.edu.dps.patterns.behavioral.command4;

public class CopyCommand extends Command {
  public CopyCommand(Application application, Editor editor) {
    super(application, editor);
  }

  @Override
  public boolean execute() {
    this.application.setClipboard(this.editor.getSelection());
    return false;
  }
}
