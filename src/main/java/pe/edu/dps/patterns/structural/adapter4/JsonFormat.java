package pe.edu.dps.patterns.structural.adapter4;

public class JsonFormat implements NewFormat {
    @Override
    public void conversion() {
        System.out.println("Conversion JSON");
    }

    @Override
    public void open() {
        System.out.println("Opening JSON");
    }
}
