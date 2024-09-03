package pe.edu.dps.train.sistema.health;

public class Licor implements Alimento {
    @Override
    public Composicion descomponer() {
        System.out.println("Descompisión alcohol");
        return new Composicion();
    }
}
