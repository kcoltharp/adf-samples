/* Copyright 2010, 2017, Oracle and/or its affiliates. All rights reserved. */
package toystore.model.dataaccess.common;
import oracle.jbo.common.JboResourceBundle;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---------------------------------------------------------------------
public class OrdersRowImplMsgBundle extends JboResourceBundle {
  static final Object[][] sMessageStrings =
  {
{ "Shipstate_DISPLAYWIDTH", "5" },
{ "Shipaddr1_DISPLAYWIDTH", "55" },
{ "Shiptofirstname_DISPLAYWIDTH", "30" },
{ "Shipcity_DISPLAYWIDTH", "55" },
{ "Shiptolastname_DISPLAYWIDTH", "30" }};

  /**This is the default constructor (do not remove)
   */
  public OrdersRowImplMsgBundle() {
  }

  /**@return an array of key-value pairs.
   */
  public Object[][] getContents() {
    return super.getMergedArray(sMessageStrings, super.getContents());
  }
}
