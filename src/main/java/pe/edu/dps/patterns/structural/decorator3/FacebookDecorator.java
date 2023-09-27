package pe.edu.dps.patterns.structural.decorator3;

public class FacebookDecorator extends DecoratorNotifier {
    @Override
    public void send(String message) {
        System.out.println("##### FACEBOOK ####");
        this.loadApi();
        this.extra();
        System.out.println("Notified By Facebook: " + message);
    }
    @Override
    public void loadApi() {
        System.out.println("Load API Facebook");
    }
    @Override
    public void extra() {
        System.out.println("Extra Facebook");
    }
}
