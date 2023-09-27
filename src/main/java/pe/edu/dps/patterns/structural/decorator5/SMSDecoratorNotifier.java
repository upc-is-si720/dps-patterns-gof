package pe.edu.dps.patterns.structural.decorator5;

import java.util.ArrayList;

public class SMSDecoratorNotifier extends DecoratorNotifier{
    private ArrayList<String> celularNumbers;

    public SMSDecoratorNotifier(Notifier notifier) {
        super(notifier);
        this.celularNumbers = new ArrayList<>();
        this.celularNumbers.add("987654321");
        this.celularNumbers.add("963258741");
    }
    @Override
    public void send(String message) {
        super.send(message);
        this.sendSMS(message);
    }
    public void sendSMS(String message) {
        for (String celularNumber : this.celularNumbers) {
            System.out.println("Send SMS to [" + celularNumber + "], message: "
                    + message );
        }
    }
}
