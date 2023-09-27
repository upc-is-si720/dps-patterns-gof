package pe.edu.dps.patterns.structural.adapter5;

public class JsonNewFormatWork implements NewFormatWork {
    @Override
    public void open() {
        System.out.println("Openning JSON Format");
        this.decode();
        this.encode();
    }

    @Override
    public void encode() {
        System.out.println("Encode JSON Format");
    }
    @Override
    public void decode() {
        System.out.println("Decode JSON Format");
    }
}
