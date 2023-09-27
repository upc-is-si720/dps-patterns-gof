package pe.edu.dps.train.sistema;

public class Fruta implements Alimento {
    private String name;
    private String origen;

    @Override
    public Composicion descomponer() {
        System.out.println("Descomponer Fruta");
        return new Composicion();
    }
}
