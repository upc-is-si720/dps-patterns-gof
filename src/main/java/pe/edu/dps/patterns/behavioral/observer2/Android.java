package pe.edu.dps.patterns.behavioral.observer2;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Android implements Celular{
    private String number;
    @Override
    public void update(String context) {
        System.out.println("Android-" + this.number + ": " + context);
    }
}
