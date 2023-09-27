package pe.edu.dps.patterns.behavioral.chain2;

public interface Handler {
    void setNext(Handler handler);
    void handle(String request);
}
