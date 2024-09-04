package pe.edu.dps.solid.openclosed.book;


public class BuyBook {
    private int stock;
    public BuyBook() {
        stock = 0;
    }
    public Book sellBook(String title) {
        reduceStock();
        return new Book();
    }
    public void reduceStock() {
        stock--;
    }
    public void addBook(Book book) {
        stock++;
        System.out.println(stock);
    }

}
