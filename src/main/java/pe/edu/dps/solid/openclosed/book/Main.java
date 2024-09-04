package pe.edu.dps.solid.openclosed.book;


public class Main {
    public static void main(String[] args) {
        BuyBook buyBook = new SubBuyBook();
        buyBook.addBook(new Book());
        buyBook.addBook(new Book());


    }
}










