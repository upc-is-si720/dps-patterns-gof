package pe.edu.dps.patterns.structural.decorator5;

import java.util.ArrayList;

public class EmailNotifier implements Notifier {
    private ArrayList<String> emails;

    public EmailNotifier() {
        this.emails = new ArrayList<>();
        this.emails.add("rosa@upc.edu.pe");
        this.emails.add("maria@upc.edu.pe");
    }
    @Override
    public void send(String message) {
        for (String email : this.emails) {
            System.out.println("Send mail to [" + email + "], message: "
                    + message );
        }
    }
}
