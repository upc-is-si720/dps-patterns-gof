package pe.edu.dps.patterns.structural.decorator3;

public abstract class DecoratorNotifier implements Notifier {


    @Override
    public void send(String message) {
        this.loadApi();
        System.out.println("Decorator Notifier");
        this.extra();
    }
    public abstract void loadApi();
    public abstract void extra();
}
