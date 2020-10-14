package pe.edu.dps.annotations;

public class Estudiante extends Persona {

    @Override
    public void saludar() {
        super.saludar();
        System.out.println("mas saludo");
    }

    @Override
    @SuppressWarnings("deprecation")
    public void caminar() {
        System.out.println("Sigo caminando");
        super.salirCalle();
    }

    @MiAnotacion
    public void estudiar() {
        Padre padre = new Padre();
    }
}
