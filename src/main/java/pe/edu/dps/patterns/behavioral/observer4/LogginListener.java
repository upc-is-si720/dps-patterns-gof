package pe.edu.dps.patterns.behavioral.observer4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LogginListener implements EventListener {
    private File log;
    private String message;

    public LogginListener(String filename, String message) {
        this.log = new File(filename);
        this.message = message;
    }

    @Override
    public void update(String filename) {
        try {
            FileWriter fileWriter = new FileWriter(this.log, true);
            fileWriter.write(this.message + "\n");
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Logging to file: " + log + " " + message);
    }


}
