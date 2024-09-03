package pe.edu.dps.train.sistema.health;

public class Verdura implements Alimento {
    @Override
    public Composicion descomponer() {
        System.out.println("Descomposición Verdura");
        return new Composicion();

    }
}
