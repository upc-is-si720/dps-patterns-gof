package pe.edu.dps.train.sistema;

public class Main {
    public static void main(String[] args) {
        Fruta manzana = new Fruta();
        Verdura cebolla = new Verdura();
        Carne pollo = new Carne();
        Licor cerveza = new Licor();
        Jarabe jarabe = new Jarabe();

        Boca boca = new Boca();
        boca.masticacion(manzana);
        boca.masticacion(cebolla);
        boca.masticacion(pollo);
        boca.masticacion(cerveza);
        boca.masticacion(jarabe);

    }
}
