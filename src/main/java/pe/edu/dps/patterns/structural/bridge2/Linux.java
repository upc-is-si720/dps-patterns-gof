package pe.edu.dps.patterns.structural.bridge2;

public class Linux implements SistemaOperativo{
    @Override
    public void mostrarEnPantalla() {
        System.out.println("Pantalla Linux");
    }

    @Override
    public void leerDelTeclado() {
        System.out.println("Teclado Linux");
    }

    @Override
    public void ejecutarProceso() {
        System.out.println("Proceso Linux");
    }
}
