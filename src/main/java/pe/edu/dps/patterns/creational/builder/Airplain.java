package pe.edu.dps.patterns.creational.builder;

public class Airplain implements Builder {
    private Product product = new Product();

    @Override
    public void buildBody() {
        product.add("This is a body of a Airplain");
    }
    @Override
    public void insertWheels() {
        product.add("18 wheels are added");
    }
    @Override
    public void addHeadlights() {
        product.add("0 Headlights are added");
    }
    @Override
    public Product getVehicle() {
        return product;
    }
}
