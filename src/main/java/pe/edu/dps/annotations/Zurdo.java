package pe.edu.dps.annotations;

import java.lang.annotation.Inherited;

@Inherited
public @interface Zurdo {
    public String escribe() default "Izquierda";
    String come() default "Izquierda";
    int comodidad() default 0;
    String nombre();
}
