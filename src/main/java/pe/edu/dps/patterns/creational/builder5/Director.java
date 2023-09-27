package pe.edu.dps.patterns.creational.builder5;

public class Director {
    private Builder builder;
    public Director(Builder builder) {
        this.builder = builder;
    }
    public void changeBuilder(Builder builder) {
        this.builder = builder;
    }

    public House make(String type) {
        if (type.equals("stone")) {
            System.out.println("Make Zapata");
        }
        builder.buildWall();
        builder.buildDoor();
        builder.buildWindow();
        // Cast
        return builder.getResult();
    }

}







