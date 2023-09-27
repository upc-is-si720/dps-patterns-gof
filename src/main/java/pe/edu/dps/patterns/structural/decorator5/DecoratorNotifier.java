package pe.edu.dps.patterns.structural.decorator5;

public abstract class DecoratorNotifier implements Notifier {
    Notifier wrappee;
    public DecoratorNotifier(Notifier notifier) {
        this.wrappee = notifier;
    }

    @Override
    public void send(String message) {
        this.wrappee.send(message);
    }
}
