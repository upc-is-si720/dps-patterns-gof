package pe.edu.dps.patterns.behavioral.command2;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
public class Icon {
    private final Command command;

    public void save() {
        command.save();
    }
}
