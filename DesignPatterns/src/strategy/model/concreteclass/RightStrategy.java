
package strategy.model.concreteclass;

import strategy.model.AlignStrategy;

public class RightStrategy implements AlignStrategy {

  @Override
  public void print(String text) {
    System.out.println(text + "+++");
  }

}
