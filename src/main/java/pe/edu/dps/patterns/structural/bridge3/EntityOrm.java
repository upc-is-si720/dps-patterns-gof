package pe.edu.dps.patterns.structural.bridge3;

public class EntityOrm extends Orm {
    public EntityOrm(Database database) {
        super(database);
    }
    @Override
    public void crear() {
        System.out.println("Running Entity Framework - Crear");
        this.database.create();
    }
    @Override
    public void leer() {
        System.out.println("Runing Entity Framework - Leer");
        this.database.read();
    }
    @Override
    public void actualizar() {
        System.out.println("Running Entity Framework - Actualizar");
        this.database.update();
    }
    @Override
    public void borrar() {
        System.out.println("Running Entity Framework - Borrar");
        this.database.delete();
    }
}
