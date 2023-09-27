package pe.edu.dps.patterns.structural.decorator3;

public class Client {
    public static void main(String[] args) {
        Notifier correo = new CorreoNotifier();
        Notifier sms = new SmsNotifier();
        Notifier mobile = new MobileNotifier();
        Notifier whatsapp = new WhatsappDecorator();
        Notifier facebook = new FacebookDecorator();

        correo.send("Patrones");
        sms.send("Patrones");
        mobile.send("Patrones");
        whatsapp.send("patrones");
        facebook.send("Patrones");
    }
}
