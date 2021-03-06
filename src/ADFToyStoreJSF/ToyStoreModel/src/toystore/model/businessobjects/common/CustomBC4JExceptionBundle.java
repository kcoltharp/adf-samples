/* Copyright 2010, 2017, Oracle and/or its affiliates. All rights reserved. */
// $Header: /cvs/ADFToyStoreJSF/ToyStoreModel/src/toystore/model/businessobjects/common/CustomBC4JExceptionBundle.java,v 1.1.1.1 2006/01/26 21:47:21 steve Exp $
package toystore.model.businessobjects.common;
import java.util.ListResourceBundle;
import oracle.jbo.CSMessageBundle;
public class CustomBC4JExceptionBundle extends ListResourceBundle {
  private static final Object[][] sMessageStrings = new String[][] {
      { CSMessageBundle.EXC_VAL_ATTR_MANDATORY, "This field is required" },
    };

  /**
   *
   * Return String Identifiers and corresponding Messages in a two-dimensional array.
   */
  protected Object[][] getContents() {
    return sMessageStrings;
  }
}
