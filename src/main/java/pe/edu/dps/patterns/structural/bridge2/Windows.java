package pe.edu.dps.patterns.structural.bridge2;

public class Windows implements SistemaOperativo{
    @Override
    public void mostrarEnPantalla() {
        System.out.println("Pantalla Windows");
    }

    @Override
    public void leerDelTeclado() {
        System.out.println("Teclado Windows");
    }

    @Override
    public void ejecutarProceso() {
        System.out.println("Proceso Windows");
    }
}
