package pe.edu.dps.patterns.structural.decorator3;

public class CorreoNotifier implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("Notifier by Email: " + message);
    }
}
