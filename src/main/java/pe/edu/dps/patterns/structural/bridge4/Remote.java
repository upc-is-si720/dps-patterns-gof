package pe.edu.dps.patterns.structural.bridge4;

public class Remote {
  private Device device;
  public Remote(Device device) {  // dependency Injection
    this.device = device;
  }
  public void togglePower() {
    if (device.isEnabled()) {
      device.disabled();
    } else {
      device.enable();
    }
  }
  public void volumenDown() {
    if (device.getVolume() > 0) {
      device.setVolume( device.getVolume() - 1 );
    }
  }
  public void volumenUp() {
    device.setVolume( device.getVolume() + 1 );
  }
  public void channelDown() {
    if (device.getChannel() > 1) {
      device.setChannel(device.getChannel() - 1);
    }
  }
  public void channelUp() {
    device.setChannel(device.getChannel() + 1);
  }

}
