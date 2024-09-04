package pe.edu.dps.solid.liskov;

import java.util.List;

public class Project {
  private List<Document> allDocs;
  private List<WritableDocument> writableDocs;

  public Project(List<Document> allDocs, List<WritableDocument> writableDocs) {
    this.allDocs = allDocs;
    this.writableDocs = writableDocs;
  }

  public void openAll() {
    for (Document doc : allDocs) {
      doc.open();
    }
  }

  public void saveAll() {
    for (WritableDocument doc : writableDocs) {
      doc.save();
    }
  }
}
