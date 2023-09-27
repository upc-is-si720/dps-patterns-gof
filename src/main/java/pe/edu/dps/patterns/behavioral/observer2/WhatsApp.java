package pe.edu.dps.patterns.behavioral.observer2;

import java.util.ArrayList;

public class WhatsApp {
    private ArrayList<Celular> celulares;
    private String message; //mainState;
    public WhatsApp() {
        celulares = new ArrayList<>();
    }
    public void subscribe(Celular celular) {
        this.celulares.add(celular);
    }
    public void unsubscribe(Celular celular) {
        this.celulares.remove(celular);
    }
    public void notifySubscribers() {
        for (Celular celular : this.celulares) {
            celular.update(message);
        }
    }
    public void sendMessage(String message) { //mainBusinessLogic() {
        this.message = message;
        this.notifySubscribers();
    }

}









