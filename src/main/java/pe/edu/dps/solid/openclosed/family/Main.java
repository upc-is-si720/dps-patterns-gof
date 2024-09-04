package pe.edu.dps.solid.openclosed.family;

public class Main {
    public static void main(String[] args) {

        Condori condori = new Condori();
        Hitler hitler = new Hitler();
        Fetuchini fetuchini = new Fetuchini();
        Lenguini lenguini = new Lenguini();
        Castillo castillo = new Castillo();

        Circolo circolo = new Circolo();
        circolo.ingresar(fetuchini);
        circolo.ingresar(lenguini);
        circolo.ingresar(castillo);

    }
}










