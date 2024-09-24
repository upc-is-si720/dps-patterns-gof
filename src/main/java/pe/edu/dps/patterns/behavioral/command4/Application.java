package pe.edu.dps.patterns.behavioral.command4;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Application {
  private String clipboard;
  private List<Editor> editors;
  private Editor activeEditor;
  private CommandHistory history;

  public Application() {
    this.clipboard = "";
    this.editors = List.of();
    this.activeEditor = new Editor();
    this.history = new CommandHistory();
  }

  public void createUI() {
    // Create a GUI

  }
  public void executeCommand(Command command) {
    if (command.execute()) {
      this.history.push(command);
    }
  }
  public void undo() {
    if (this.history.isEmpty()) {
      return;
    }
    Command command = this.history.pop();
    if (command != null) {
      command.undo();
    }
  }
}
