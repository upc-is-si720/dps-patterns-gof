package pe.edu.dps.solid.interfacesegregation;

public interface CloudStorageProvider {
  void storeFile(String name);
  void getFile(String name);
}
