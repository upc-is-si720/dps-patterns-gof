package pe.edu.dps.patterns.behavioral.observer4;

import java.util.HashMap;

public class EventManager {
    private HashMap<String, EventListener> listeners = new HashMap<>();

    public void subscribe(String eventType, EventListener listener) {
        listeners.put(eventType, listener);
    }
    public void unsubscribe(String eventType, EventListener listener) {
        listeners.remove(eventType, listener);
    }
    public void notify(String eventType, String filename) {
        EventListener listener = listeners.get(eventType);
        listener.update(filename);
    }
}
