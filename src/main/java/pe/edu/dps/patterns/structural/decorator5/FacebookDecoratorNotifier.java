package pe.edu.dps.patterns.structural.decorator5;

import java.util.ArrayList;

public class FacebookDecoratorNotifier extends DecoratorNotifier {

    private ArrayList<String> accounts;
    public FacebookDecoratorNotifier(Notifier notifier) {
        super(notifier);
        this.accounts = new ArrayList<>();
        this.accounts.add("maria154");
        this.accounts.add("rosita58");
    }

    @Override
    public void send(String message) {
        super.send(message);
        this.sendComment(message);
    }

    public void sendComment(String message) {
        for (String account : this.accounts) {
            System.out.println("Send Comment to [" + account + "], message: "
                    + message );
        }
    }
}
