package pe.edu.dps.patterns.structural.bridge4;

public class Radio implements Device {
  private boolean status;
  private Integer volumen;
  private Integer channel;

  public Radio() {
    this.status = false;
    this.volumen = 0;
    this.channel = 1;
  }
  @Override
  public boolean isEnabled() {
    return status;
  }

  @Override
  public void enable() {
    this.status = true;
  }

  @Override
  public void disabled() {
    this.status = false;
  }

  @Override
  public Integer getVolume() {
    return this.volumen;
  }

  @Override
  public void setVolume(Integer percent) {
    this.volumen = percent;
  }

  @Override
  public Integer getChannel() {
    return this.channel;
  }

  @Override
  public void setChannel(Integer channel) {
    this.channel = channel;
  }
}
