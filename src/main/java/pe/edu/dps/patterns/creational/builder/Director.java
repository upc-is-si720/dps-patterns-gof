package pe.edu.dps.patterns.creational.builder;

public class Director {
    private Builder myBuilder;

    // A series of steps—for the production​
    public void construct(Builder builder) {
        this.myBuilder = builder;
        this.myBuilder.buildBody();
        this.myBuilder.insertWheels();
        this.myBuilder.addHeadlights();
    }
}
