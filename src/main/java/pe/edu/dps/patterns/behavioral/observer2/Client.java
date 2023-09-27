package pe.edu.dps.patterns.behavioral.observer2;

public class Client {
    public static void main(String[] args) {
        WhatsApp group = new WhatsApp();
        Celular rosa = new Android("987654321");
        Celular maria = new Android("963258741");
        Celular carlos = new IOs("987321456");
        Celular pedro = new IOs("951236874");
        Celular luisa = new Web("Rn4h3eR");
        Celular manuel = new Web("Yuj7n45");

        group.subscribe(rosa);
        group.subscribe(maria);
        group.subscribe(carlos);
        group.subscribe(pedro);
        group.subscribe(luisa);
        group.subscribe(manuel);

        group.sendMessage("Hola, Bienvenidos al grupo");
        group.sendMessage("HOy toca programar");

        group.unsubscribe(carlos);
        group.unsubscribe(manuel);

        group.sendMessage("Se salio de grupo Carlos y manuel");

    }
}








