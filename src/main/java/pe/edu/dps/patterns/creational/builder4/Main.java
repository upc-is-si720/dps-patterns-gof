package pe.edu.dps.patterns.creational.builder4;

public class Main {

    public static void main(String[] args) {
        House house = new Builder().garage("Si").door("si").wall("SI").builder();
        House house2 = new Builder().garage("Si").builder();

        System.out.println(house);
        System.out.println(house2);


    }
}
