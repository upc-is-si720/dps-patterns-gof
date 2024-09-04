package pe.edu.dps.solid.openclosed.book;

public class UseBuyBook {
    private BuyBook buyBook;

    public UseBuyBook() {
        this.buyBook = new BuyBook();
    }

    public void useBuyBook() {
        buyBook.sellBook("40 años de soledad");
    }
}
