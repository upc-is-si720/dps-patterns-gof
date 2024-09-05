package pe.edu.dps.solid.dependencyinversion.service;

public interface Database {
  void insert();
  void update();
  void delete();
  void connect();
  void disconnect();
}
