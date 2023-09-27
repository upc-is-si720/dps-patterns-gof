package pe.edu.dps.patterns.structural.bridge3;

public class JpaOrm extends Orm {
    public JpaOrm(Database database) {
        super(database);
    }
    @Override
    public void crear() {
        System.out.println("Running JPA - Crear");
        this.database.create();
    }
    @Override
    public void leer() {
        System.out.println("Runing JPA - Leer");
        this.database.read();
    }
    @Override
    public void actualizar() {
        System.out.println("Running JPA - Actualizar");
        this.database.update();
    }
    @Override
    public void borrar() {
        System.out.println("Running JPA - Borrar");
        this.database.delete();
    }
}
