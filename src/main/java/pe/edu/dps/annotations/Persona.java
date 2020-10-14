package pe.edu.dps.annotations;

public abstract class Persona {
    private int id;
    private String dni;
    private String nombres;

    public void saludar() {
        System.out.println("Hello");
    }
    public abstract void caminar();

    @Deprecated
    public void salirCalle() {
        System.out.println("Vamos a camicar");
    }
    @SuppressWarnings("deprecation")
    public void tomar() {

    }
}
