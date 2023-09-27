package pe.edu.dps.train.sistema;

public class Carne implements Alimento{
    @Override
    public Composicion descomponer() {
        System.out.println("Descomponer Carne");
        return new Composicion();
    }
}
