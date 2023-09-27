package pe.edu.dps.patterns.structural.adapter4;

public class Base64Format implements NewFormat{

    @Override
    public void conversion() {
        System.out.println("Conversion Base64");
    }

    @Override
    public void open() {
        System.out.println("Opening Base64");
    }
}
