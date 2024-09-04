package pe.edu.dps.solid.interfacesegregation;

public class Amazon implements CloudHostingProvider, CdnProvider, CloudStorageProvider {

  @Override
  public void createServer(String region) {
    System.out.println("Creating a server in " + region);
  }

  @Override
  public void listServers(String region) {
    System.out.println("Listing servers in " + region);
  }

  @Override
  public String getCDNAddress() {
    return "cdn.amazon.com";
  }

  @Override
  public void storeFile(String name) {
    System.out.println("Amazon: Storing file " + name);
  }

  @Override
  public void getFile(String name) {
    System.out.println("Amazon: Getting file " + name);
  }
}
