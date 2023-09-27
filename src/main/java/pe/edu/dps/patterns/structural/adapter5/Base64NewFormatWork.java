package pe.edu.dps.patterns.structural.adapter5;

public class Base64NewFormatWork implements NewFormatWork {
    @Override
    public void open() {
        System.out.println("Opennig Base64 New Format");
        this.encode();
        System.out.println("Adding file in JSON");
        this.decode();
    }
    @Override
    public void encode() {
        System.out.println("Convert file in Base64");
    }
    @Override
    public void decode() {
        System.out.println("Convert Base64 in File ");
    }
}
