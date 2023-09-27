package pe.edu.dps.patterns.creational.singleton;

public class Solitario {

    private static Solitario instance;

    private Solitario() {

    }
    public static Solitario getInstance() {
        if (instance == null) {
            instance = new Solitario();
        }
        return instance;
    }
}
