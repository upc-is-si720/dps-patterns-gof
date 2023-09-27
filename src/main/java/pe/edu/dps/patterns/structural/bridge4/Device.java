package pe.edu.dps.patterns.structural.bridge4;

public interface Device {
  boolean isEnabled();
  void enable();
  void disabled();
  Integer getVolume();
  void setVolume(Integer percent);
  Integer getChannel();
  void setChannel(Integer channel);

}
