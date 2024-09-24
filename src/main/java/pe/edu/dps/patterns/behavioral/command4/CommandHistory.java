package pe.edu.dps.patterns.behavioral.command4;

import java.util.List;

public class CommandHistory {
  private List<Command> commands;

  public CommandHistory() {
    this.commands = List.of();
  }
  public void push(Command command) {
    this.commands.add(command);
  }
  public Command pop() {
    if (this.commands.isEmpty()) {
      return null;
    }
    Command command = this.commands.get(this.commands.size() - 1);
    this.commands.remove(this.commands.size() - 1);
    return command;
  }
  public boolean isEmpty() {
    return this.commands.isEmpty();
  }
}
