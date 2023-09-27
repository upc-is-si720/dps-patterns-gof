package pe.edu.dps.patterns.structural.adapter5;

public class TxtFormatWork implements FormatWork {
    @Override
    public void open() {
        System.out.println("Opening TXT format");
        System.out.println("Getting data from TXT format");
    }
}
