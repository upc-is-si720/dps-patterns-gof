package pe.edu.dps.patterns.behavioral.observer3;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Web implements Subscriber{
    private String email;
    @Override
    public void update(String video, String message) {
        System.out.println("[" + this.email + "]: Recibió " +
                video + ", Message: " + message);
    }
}
