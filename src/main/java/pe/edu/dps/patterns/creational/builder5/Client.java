package pe.edu.dps.patterns.creational.builder5;

public class Client {
    public static void main(String[] args) {
        Builder woodBuilder = new WoodBuilder();  // Recomendado
        StoneBuilder stoneBuilder = new StoneBuilder();

        Director director = new Director(stoneBuilder);
        director.make("stone");

        director.changeBuilder(woodBuilder);
        director.make("wood");

    }
}
