package pe.edu.dps.patterns.structural.bridge3;

public abstract class Orm {
    protected Database database;
    public Orm(Database database) {
        this.database = database;
    }
    public abstract void crear();
    public abstract void leer();
    public abstract void actualizar();
    public abstract void borrar();



}
