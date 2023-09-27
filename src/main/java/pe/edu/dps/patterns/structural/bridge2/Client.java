package pe.edu.dps.patterns.structural.bridge2;

public class Client {
    public static void main(String[] args) {
        Application app;
        app = new WebApp("linux");
        app.leerUnNumero();
        app.CalcularSuma();

        Application desk = new DesktopApp("mac");
        desk.leerUnNumero();
        desk.CalcularSuma();
    }
}
