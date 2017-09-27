/* Copyright 2010, 2017, Oracle and/or its affiliates. All rights reserved. */
// $Header: /cvs/ADFToyStoreJSF/ToyStoreModel/src/toystore/model/dataaccess/client/ProductListClient.java,v 1.1.1.1 2006/01/26 21:47:22 steve Exp $
package toystore.model.dataaccess.client;
import oracle.jbo.client.remote.ViewUsageImpl;
//  ---------------------------------------------------------------
//  ---    File generated by Oracle Business Components for Java.
//  ---------------------------------------------------------------
public class ProductListClient extends ViewUsageImpl
  implements toystore.model.dataaccess.common.ProductList {
  /**
   *
   *  This is the default constructor (do not remove)
   */
  public ProductListClient() {
  }

  public void setProductIdToFind(String productId) {
    Object _ret = getApplicationModuleProxy().riInvokeExportedMethod(this, "setProductIdToFind", new String[] {"java.lang.String"}, new Object[] {productId});
    return;
  }



}