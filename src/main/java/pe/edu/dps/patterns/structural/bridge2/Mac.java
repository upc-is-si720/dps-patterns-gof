package pe.edu.dps.patterns.structural.bridge2;

public class Mac implements SistemaOperativo{
    @Override
    public void mostrarEnPantalla() {
        System.out.println("Pantalla Mac");
    }

    @Override
    public void leerDelTeclado() {
        System.out.println("Teclado Mac");
    }

    @Override
    public void ejecutarProceso() {
        System.out.println("Proceso Mac");
    }
}
