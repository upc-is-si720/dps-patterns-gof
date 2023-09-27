package pe.edu.dps.patterns.behavioral.chain2;

public class Component implements Handler {

    protected Handler next;
    @Override
    public void setNext(Handler handler) {
        this.next = handler;
    }
    @Override
    public void handle(String request) {
        if (this.next != null) {
            next.handle(request);
        }
    }
}
