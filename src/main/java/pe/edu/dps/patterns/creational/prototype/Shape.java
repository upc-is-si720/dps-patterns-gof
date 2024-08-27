package pe.edu.dps.patterns.creational.prototype;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class Shape implements Prototype {
    private Integer x;
    private Integer y;
    private String color;

    public Shape() { }
    public Shape(Shape source) {
        this();
        this.x = source.x;
        this.y = source.y;
        this.color = source.color;
    }
    public void view() {
        System.out.println("x = "+ this.x);
        System.out.println("y = "+ this.y);
        System.out.println("color = "+ this.color);
    }

    @Override
    public abstract Prototype clone() ;
}













