package pe.edu.dps.patterns.behavioral.command4;

public class CutCommand extends Command {
  public CutCommand(Application application, Editor editor) {
    super(application, editor);
  }

  @Override
  public boolean execute() {
    this.saveBackup();
    this.application.setClipboard(this.editor.getSelection());
    this.editor.deleteSelection();
    return true;
  }
}
