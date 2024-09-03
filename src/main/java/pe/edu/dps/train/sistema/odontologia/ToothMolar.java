package pe.edu.dps.train.sistema.odontologia;

import pe.edu.dps.train.sistema.health.Tooth;

public class ToothMolar extends Tooth {
    @Override
    public void healing() {
        super.healing();
        System.out.println("Special Healing");
    }
}
