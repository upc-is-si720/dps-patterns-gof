package pe.edu.dps.train.sistema;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.ArrayList;

@Setter
@Getter
@AllArgsConstructor
public class Boca {
    private List<Tooth> teeth;
    private Lengua lengua;
    private GlandulaSalival glandulaSalival;
    private Faringe faringe;

    private String name;

    private Alimento alimento;
    private Medicina medicina;

    public Boca() {
        teeth = new ArrayList<>();
        lengua = new Lengua();
        glandulaSalival = new GlandulaSalival();
        faringe = new Faringe();
    }

    public BoloAlimenticio masticacion(Alimento alimento) {
        alimento.descomponer();
        return new BoloAlimenticio();
    }
    public void enviarFaringe(BoloAlimenticio boloAlimenticio) {
        faringe.recibir(boloAlimenticio);
    }

}












