package pe.edu.dps.solid.interfacesegregation;

public class Dropbox implements CloudStorageProvider {

    @Override
    public void storeFile(String name) {
        System.out.println("Dropbox: Storing file: " + name);
    }

    @Override
    public void getFile(String name) {
        System.out.println("Dropbox: Getting file: " + name);
    }
}
