package pe.edu.dps.solid.openclosed;

import pe.edu.dps.solid.single.Book;

public class Main {
    public static void main(String[] args) {
        BuyBook buyBook = new SubBuyBook();
        buyBook.addBook(new Book());
        buyBook.addBook(new Book());

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










