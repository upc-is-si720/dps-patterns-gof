package pe.edu.dps.patterns.behavioral.observer2;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Web implements Celular{
    private String qr;
    @Override
    public void update(String context) {
        System.out.println("Web-" + this.qr + ": " + context);
    }
}
