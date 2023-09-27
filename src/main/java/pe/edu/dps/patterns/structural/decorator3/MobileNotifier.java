package pe.edu.dps.patterns.structural.decorator3;

public class MobileNotifier implements Notifier{
    @Override
    public void send(String message) {
        System.out.println("Notifier by Mobile: " + message);
    }
}
