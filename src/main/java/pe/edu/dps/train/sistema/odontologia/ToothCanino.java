package pe.edu.dps.train.sistema.odontologia;

import pe.edu.dps.train.sistema.health.Tooth;

public class ToothCanino extends Tooth {
    @Override
    public void healing() {
        System.out.println("Canino Healing");
    }
}
