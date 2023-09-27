package pe.edu.dps.patterns.structural.adapter5;

public class AdapterFormatWork implements FormatWork{
    private NewFormatWork newFormatWork;
    public AdapterFormatWork(String newFormat) {
        if (newFormat.equals("json")) {
            newFormatWork = new JsonNewFormatWork();
        }
        if (newFormat.equals("base64")) {
            newFormatWork = new Base64NewFormatWork();
        }
    }

    @Override
    public void open() {
        this.newFormatWork.open();
    }
}
