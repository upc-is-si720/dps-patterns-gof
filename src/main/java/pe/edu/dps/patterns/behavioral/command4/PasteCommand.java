package pe.edu.dps.patterns.behavioral.command4;

public class PasteCommand extends Command {
  public PasteCommand(Application application, Editor editor) {
    super(application, editor);
  }

  @Override
  public boolean execute() {
    this.saveBackup();
    this.editor.replaceSelection(this.application.getClipboard());
    return true;
  }
}
