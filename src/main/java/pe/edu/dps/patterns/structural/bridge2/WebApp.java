package pe.edu.dps.patterns.structural.bridge2;

public class WebApp extends Application {
    public WebApp(String sistemaOperativo) {
        super(sistemaOperativo);
    }

    @Override
    void leerUnNumero() {
        System.out.println("Cargar Navegador");
        this.sistemaOperativo.leerDelTeclado();
        this.sistemaOperativo.mostrarEnPantalla();
    }

    @Override
    void CalcularSuma() {
        System.out.println("Cargar Navegador");
        this.sistemaOperativo.leerDelTeclado();
        this.sistemaOperativo.mostrarEnPantalla();
        this.sistemaOperativo.ejecutarProceso();
        this.sistemaOperativo.mostrarEnPantalla();

    }
}
