package pe.edu.dps.train.sistema.odontologia;

import pe.edu.dps.train.sistema.Tooth;

public class Main {
    public static void main(String[] args) {
        Tooth tooth; // declaration
        tooth = new ToothIncisivo();
        tooth.healing();
        tooth = new ToothMolar();
        tooth.healing();
        tooth = new ToothCanino();
        tooth.healing();
    }
}
