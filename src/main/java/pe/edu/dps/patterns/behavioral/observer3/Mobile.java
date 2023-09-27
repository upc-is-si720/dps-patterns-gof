package pe.edu.dps.patterns.behavioral.observer3;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Mobile implements Subscriber{
    private String number;
    private TikTok tikTok;
    @Override
    public void update(String video, String message) {
        System.out.println("[" + this.number + "]: Recibió " +
                video + ", Message: " + message);
    }
    public void publishVideo(String video, String message) {
        tikTok.publishVideoFromMobile(this.number, video, message);
    }
}
