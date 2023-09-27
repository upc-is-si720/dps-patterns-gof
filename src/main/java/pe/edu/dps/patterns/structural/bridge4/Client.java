package pe.edu.dps.patterns.structural.bridge4;

public class Client {
  public static void main(String[] args) {
    Device device = new Radio();
    Radio radio = new Radio();
    Tv tv = new Tv();
    Device dtv = new Tv();

    Remote remote = new Remote(tv);
    remote.togglePower();
    remote.channelUp();
    remote.channelDown();

    AdvancedRemote advancedRemote = new AdvancedRemote(tv);
    advancedRemote.togglePower();
    advancedRemote.volumenDown();
    advancedRemote.menu();
    advancedRemote.mute();
  }
}
