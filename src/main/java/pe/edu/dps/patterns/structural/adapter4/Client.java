package pe.edu.dps.patterns.structural.adapter4;

public class Client {
    public static void main(String[] args) {
        Format xml = new XmlFormat();
        xml.open();
        Format wsdl = new WsdlFormat();
        wsdl.open();

        Format json = new AdapterFormat("json");
        json.open();

        Format base64 = new AdapterFormat("base64");
        base64.open();

    }
}
