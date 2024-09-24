package pe.edu.dps.patterns.behavioral.command4;

public abstract class Command {
  protected Application application;
  protected Editor editor;
  protected String backup;

  public Command(Application application, Editor editor) {
    this.application = application;
    this.editor = editor;
  }

  public void saveBackup() {
    this.backup = this.editor.getText();
  }

  public void undo() {
    this.editor.setText(this.backup);
  }

  public abstract boolean execute();
}
