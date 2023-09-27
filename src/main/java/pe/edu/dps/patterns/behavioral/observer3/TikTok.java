package pe.edu.dps.patterns.behavioral.observer3;

import java.util.ArrayList;

public class TikTok {
    private ArrayList<Subscriber> subscribers;
    private String video;
    private String message;
    private String comment;

    public TikTok() {
        subscribers = new ArrayList<>();
    }
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }
    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }
    private void notifySubscribers() {
        for(Subscriber s : subscribers ) {
            s.update(this.video, this.message);
        }
    }
    public void publishVideoAndMessage(String video, String message) {
        this.video = video;
        this.message = message;
        this.notifySubscribers();
    }

    void publishVideoFromMobile(String number, String video, String message) {
        String newMessage = "(" + number + ")-" + message;
        this.publishVideoAndMessage(video, newMessage);
    }
}







