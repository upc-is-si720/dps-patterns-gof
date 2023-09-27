package pe.edu.dps.patterns.structural.adapter4;

public class XmlFormat implements Format {
    @Override
    public void serializar() {
        System.out.println("Serialziando XML");
    }

    @Override
    public void open() {
        System.out.println("Opening XML");
    }
}
