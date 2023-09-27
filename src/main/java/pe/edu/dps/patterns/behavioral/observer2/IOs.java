package pe.edu.dps.patterns.behavioral.observer2;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class IOs implements Celular{
    private String number;
    @Override
    public void update(String context) {
        System.out.println("iOS-" + this.number + ": " + context);
    }
}
