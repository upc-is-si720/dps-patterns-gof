package pe.edu.dps.solid.openclosed;

import pe.edu.dps.solid.single.Book;

public class SubBuyBook extends BuyBook {
    @Override
    public void addBook(Book book) {
        super.addBook(book);
        System.out.println("Adding new book");
    }
}
