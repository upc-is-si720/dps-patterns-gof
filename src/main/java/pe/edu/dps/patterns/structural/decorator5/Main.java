package pe.edu.dps.patterns.structural.decorator5;

public class Main {
    public static void main(String[] args) {
        Notifier notifier = new EmailNotifier();
        notifier.send("Patrones");

        Notifier notifierEmail = new EmailNotifier();
        FacebookDecoratorNotifier facebook = new FacebookDecoratorNotifier(notifierEmail);
        SMSDecoratorNotifier sms = new SMSDecoratorNotifier(facebook);

        sms.send("Desde Facebook");


    }
}
