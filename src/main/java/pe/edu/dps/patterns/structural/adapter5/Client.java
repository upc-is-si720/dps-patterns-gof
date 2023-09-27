package pe.edu.dps.patterns.structural.adapter5;

public class Client {
    public static void main(String[] args) {
        FormatWork xml;
        xml = new XmlFormatWork();
        xml.open();

        FormatWork txt = new TxtFormatWork();
        txt.open();

        FormatWork json = new AdapterFormatWork("json");
        json.open();

        FormatWork base64 = new AdapterFormatWork("base64");
        base64.open();
    }
}
