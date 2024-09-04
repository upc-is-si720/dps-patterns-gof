package pe.edu.dps.solid.interfacesegregation;

public class Main {
  public static void main(String[] args) {
    Amazon amazon = new Amazon();
    amazon.createServer("us-east-1");
    amazon.listServers("us-east-1");
    System.out.println("CDN address: " + amazon.getCDNAddress());
    amazon.storeFile("file.txt");
    amazon.getFile("file.txt");

    Dropbox dropbox = new Dropbox();
    dropbox.storeFile("file.txt");
    dropbox.getFile("file.txt");
  }
}
