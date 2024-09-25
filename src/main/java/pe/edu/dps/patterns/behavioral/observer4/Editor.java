package pe.edu.dps.patterns.behavioral.observer4;

import lombok.Getter;
import lombok.Setter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

@Getter
@Setter
public class Editor {
    private EventManager events;
    private File file;

    public Editor() {
        this.events = new EventManager();
    }

    public void openFile(String filePath) {
        this.file = new File(filePath);
        events.notify("open", file.getName());
    }

    public void saveFile() {
        try {
            FileWriter fileWriter = new FileWriter(this.file, true);
            fileWriter.write("Saving to file: " + this.file.getName() + "\n");
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        this.events.notify("save", this.file.getName());
    }
}
