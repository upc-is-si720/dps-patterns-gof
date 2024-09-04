package pe.edu.dps.solid.liskov;

import java.util.List;

public class Main {
  public static void main(String[] args) {
    WritableDocument report = new WritableDocument("report.txt");
    WritableDocument test = new WritableDocument("test.txt");
    Document reportAnual = new Document("report-anual.txt");

    List<Document> allDocs = List.of(report, reportAnual, test);
    List<WritableDocument> writableDocs = List.of(report, test);

    Project project = new Project(allDocs, writableDocs);
    project.openAll();
    project.saveAll();
  }
}
