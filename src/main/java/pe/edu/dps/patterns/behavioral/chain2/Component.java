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
            System.out.println("--Derivandolo--");
            next.handle(request);
        }
        else {
            System.out.println("No hay nadie que te pueda atender");
        }

    }
}
