package pe.edu.dps.patterns.behavioral.observer4;

public class Application {
    private Editor editor;

    public Application() {
        editor = new Editor();
    }

    public void config() {

        LogginListener logger = new LogginListener("looger.txt", "Logger: Hello developers");
        EmailAlertsListener emailAlerts = new EmailAlertsListener("pcsijflo@upc.edu.pe", "Email: Hello developers");
        this.editor.getEvents().subscribe("open", logger);
        this.editor.getEvents().subscribe("save", emailAlerts);
    }

}
