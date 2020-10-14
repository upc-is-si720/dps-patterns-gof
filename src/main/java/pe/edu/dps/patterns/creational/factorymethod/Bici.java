package pe.edu.dps.patterns.creational.factorymethod;

public class Bici implements Vehiculo{

    public void encender() {
        System.out.println("Las Bicis no tienen motor");
    }


    public void acelerar() {
        System.out.println("Pedalea fuerte");
    }


    public void frenar() {
        System.out.println("Presiona el freno trasero");
    }


    public void girar() {
        System.out.println("Usa el manubrio");
    }
}
