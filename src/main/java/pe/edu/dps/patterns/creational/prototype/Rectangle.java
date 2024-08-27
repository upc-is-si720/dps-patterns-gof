package pe.edu.dps.patterns.creational.prototype;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
public class Rectangle extends Shape{

    private Integer width;
    private Integer height;

    public Rectangle() {
        super();
    }
    public Rectangle(Rectangle source) {
        super(source);
        this.width = source.width;
        this.height = source.height;
    }
    @Override
    public void view() {
        super.view();
        System.out.println("width = "+ this.width);
        System.out.println("height = "+ this.height);
    }

    @Override
    public Rectangle clone() {
        return new Rectangle(this);
    }
}













