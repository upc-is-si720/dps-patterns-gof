package pe.edu.dps.patterns.creational.builder;

public class Car implements Builder {
    private Product product = new Product();

    @Override
    public void buildBody() {
        product.add("This is a body of a Car");
    }
    @Override
    public void insertWheels() {
        product.add("4 wheels are added");
    }
    @Override
    public void addHeadlights() {
        product.add("2 Headlights are added");
    }
    @Override
    public Product getVehicle() {
        return product;
    }
}
