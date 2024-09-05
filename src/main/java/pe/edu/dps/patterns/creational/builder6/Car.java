package pe.edu.dps.patterns.creational.builder6;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Car {
    private int seat;
    private String engine;
    private String tripComputer;
    private String gps;
    private String brand;

    public Car(String brand) {
        this.brand = brand;
    }
}
