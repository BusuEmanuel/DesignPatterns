/*
 * Copyright (c) 2018 SSI Schaefer Noell GmbH
 *
 * $Header: $
 */

package patterns.model;

import patterns.model.Visitor;

/**
 * @author <a href="mailto:bario@ssi-schaefer-noell.com">bario</a>
 * @version $Revision: $, $Date: $, $Author: $
 */

public interface Element {
  public void add(Element element);

  public void remove(Element element);

  public Element getElement(int index);

  public void print();

  public void accept(Visitor visitor);

}
