package pe.edu.dps.train.sistema;

public class Jarabe implements Medicina,Alimento {
    @Override
    public Composicion descomponer() {
        System.out.println("Descomponer jarabe");
        return new Composicion();
    }

    @Override
    public Drug diluir() {
        System.out.println("Diluir jarabe");
        return new Drug();
    }
}
