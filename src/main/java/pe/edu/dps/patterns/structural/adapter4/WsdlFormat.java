package pe.edu.dps.patterns.structural.adapter4;

public class WsdlFormat implements Format {
    @Override
    public void serializar() {
        System.out.println("Serializando WSDL");
    }

    @Override
    public void open() {
        System.out.println("Opening Wsdl");
    }
}
