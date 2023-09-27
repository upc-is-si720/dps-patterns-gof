package pe.edu.dps.patterns.behavioral.observer3;

public class Client {
    public static void main(String[] args) {
        TikTok tikTok = new TikTok();
        Subscriber carlos = new Mobile("987654321", tikTok);
        Subscriber pedro = new Mobile("963258741", tikTok);
        Mobile maria = new Mobile("951236874", tikTok);
        Subscriber jose = new Web("jose@upc.edu.pe");
        Subscriber rosa = new Web("rosa@upc.edu.pe");

        tikTok.subscribe(carlos);
        tikTok.subscribe(pedro);
        tikTok.subscribe(maria);

        tikTok.publishVideoAndMessage("gatitos", "Video de Gatitos");
        tikTok.publishVideoAndMessage("trafico", "Video de Trafico");

        tikTok.subscribe(jose);
        tikTok.subscribe(rosa);
        tikTok.unsubscribe(carlos);

        maria.publishVideo("gatitos2", "Nuevo video de gatitos");
    }
}
