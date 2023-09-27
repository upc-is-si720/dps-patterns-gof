package pe.edu.dps.patterns.structural.bridge4;

public class Tv implements Device{
  @Override
  public boolean isEnabled() {
    return false;
  }

  @Override
  public void enable() {

  }

  @Override
  public void disabled() {

  }

  @Override
  public Integer getVolume() {
    return null;
  }

  @Override
  public void setVolume(Integer percent) {

  }

  @Override
  public Integer getChannel() {
    return null;
  }

  @Override
  public void setChannel(Integer channel) {

  }
}
