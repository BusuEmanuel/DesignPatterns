
package patterns.command;

import json.JSONBuilder;
import patterns.model.Book;
import patterns.singleton.DocumentManager;

public class OpenCommand implements Command {

  @Override
  public void execute() {
    JSONBuilder jsonBuilder = new JSONBuilder("book.json");
    jsonBuilder.build();
    Book book = new patterns.model.Book("carte1");
    book.add(jsonBuilder.getResult());
    DocumentManager.getInstance().setBook(book);
    book.print();
  }

}
