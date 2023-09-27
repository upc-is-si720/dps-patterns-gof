package pe.edu.dps.patterns.structural.adapter5;

public class XmlFormatWork implements FormatWork{
    @Override
    public void open() {
        System.out.println("Opening XML format");
        System.out.println("Getting data from XML format");
    }
}
