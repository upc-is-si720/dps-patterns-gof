package pe.edu.dps.patterns.behavioral.command2;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Shortcut {
    private final Command command;
    public void cmdS() {
        command.save();
    }
}
