package pe.edu.dps.patterns.behavioral.command2;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Menu {
    private final Command command;
    public void save() {
        command.save();
    }
}
