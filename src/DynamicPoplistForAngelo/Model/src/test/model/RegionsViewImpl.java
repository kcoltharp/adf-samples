/* Copyright 2010, 2017, Oracle and/or its affiliates. All rights reserved. */
package test.model;
import oracle.jbo.Key;
import oracle.jbo.Row;
import oracle.jbo.server.ViewObjectImpl;
import oracle.jbo.domain.Number;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class RegionsViewImpl extends ViewObjectImpl {
  /**This is the default constructor (do not remove)
   */
  public RegionsViewImpl() {
  }
  public void setCurrentRowToRegionWithId(Number id) {
    Row[] r = findByKey(new Key(new Object[]{id}),1);
    if (r != null && r.length > 0) {
      setCurrentRow(r[0]);
    }
  }
}
