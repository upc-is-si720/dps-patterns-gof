package pe.edu.dps.patterns.structural.adapter4;

public class AdapterFormat implements Format {

    private NewFormat newFormat;

    public AdapterFormat(String formato) {
        if (formato.equals("json")) {
            newFormat = new JsonFormat();
        }
        if (formato.equals("base64")) {
            newFormat = new Base64Format();
        }
    }

    @Override
    public void open() {
        newFormat.open();
    }

    @Override
    public void serializar() {

    }
}









