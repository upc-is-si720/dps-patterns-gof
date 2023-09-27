package pe.edu.dps.patterns.structural.decorator3;

public class SmsNotifier implements Notifier{
    @Override
    public void send(String message) {
        System.out.println("Notifier SMS: " + message);
    }
}
