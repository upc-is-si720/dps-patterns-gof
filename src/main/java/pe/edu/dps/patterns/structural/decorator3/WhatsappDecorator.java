package pe.edu.dps.patterns.structural.decorator3;

public class WhatsappDecorator extends DecoratorNotifier{
    @Override
    public void loadApi() {
        System.out.println("Load API WhatsApp");
    }

    @Override
    public void extra() {
        System.out.println("Extra message WhatsApp");
    }
}
