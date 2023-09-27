package pe.edu.dps.patterns.structural.bridge2;

public abstract class Application {
    protected SistemaOperativo sistemaOperativo;

    public Application(String sistemaOperativo) {
        if (sistemaOperativo.equals("windows"))
            this.sistemaOperativo = new Windows();
        if (sistemaOperativo.equals("linux"))
            this.sistemaOperativo = new Linux();
        if (sistemaOperativo.equals("mac"))
            this.sistemaOperativo = new Mac();
    }
    abstract void leerUnNumero();
    abstract void CalcularSuma();
}
