/*
 * Copyright (c) 2018 SSI Schaefer Noell GmbH
 *
 * $Header: $
 */

package strategy.model;

/**
 * @author <a href="mailto:bario@ssi-schaefer-noell.com">bario</a>
 * @version $Revision: $, $Date: $, $Author: $
 */

public class Paragraph implements Element {
  private String text;
  private AlignStrategy align;

  public AlignStrategy getAlignStrategy() {
    return align;
  }

  public void setAlignStrategy(AlignStrategy alignStrategy) {
    this.align = alignStrategy;
  }

  public Paragraph(String text) {
    this.text = text;
  }

  @Override
  public void print() {
    if (align != null) {
      align.print(text);
    } else {
      System.out.println(text);
    }
  }

  @Override
  public void add(Element element) {
    System.out.println("ERORR");
  }

  @Override
  public void remove(Element element) {
    System.out.println("ERORR");

  }

  @Override
  public Element getElement(int index) {
    System.out.println("ERORR");
    return null;
  }

}
// avem un paragraph care implementeaza interfata alignedparagraph care are metoda print 
// creem clase 
