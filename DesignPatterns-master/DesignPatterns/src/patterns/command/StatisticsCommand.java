
package patterns.command;

import patterns.model.BookStatistics;
import patterns.singleton.DocumentManager;

public class StatisticsCommand implements Command {

  @Override
  public void execute() {
    BookStatistics stats = new BookStatistics();
    DocumentManager.getInstance().getBook().accept(stats);
    stats.printStatistics();

  }

}
