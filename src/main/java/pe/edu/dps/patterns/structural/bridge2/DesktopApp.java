package pe.edu.dps.patterns.structural.bridge2;

public class DesktopApp extends Application {
    public DesktopApp(String sistemaOperativo) {
        super(sistemaOperativo);
    }

    @Override
    void leerUnNumero() {
        System.out.println("Ejecutar Desktop");
        this.sistemaOperativo.leerDelTeclado();
        this.sistemaOperativo.mostrarEnPantalla();
    }

    @Override
    void CalcularSuma() {
        System.out.println("Ejecutar Desktop");
        this.sistemaOperativo.leerDelTeclado();
        this.sistemaOperativo.mostrarEnPantalla();
        this.sistemaOperativo.ejecutarProceso();
        this.sistemaOperativo.mostrarEnPantalla();

    }
}
