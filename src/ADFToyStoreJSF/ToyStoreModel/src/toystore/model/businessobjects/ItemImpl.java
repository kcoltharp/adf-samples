/* Copyright 2010, 2017, Oracle and/or its affiliates. All rights reserved. */
// $Header: /cvs/ADFToyStoreJSF/ToyStoreModel/src/toystore/model/businessobjects/ItemImpl.java,v 1.1.1.1 2006/01/26 21:47:20 steve Exp $
package toystore.model.businessobjects;
// ---------------------------------------------------------------
// ---    File generated by Oracle Business Components for Java.
// ---------------------------------------------------------------
import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import toystore.fwk.model.businessobjects.ToyStoreEntityImpl;
public class ItemImpl extends ToyStoreEntityImpl {
  public static final int ITEMID = 0;
  public static final int PRODUCTID = 1;
  public static final int LISTPRICE = 2;
  public static final int UNITCOST = 3;
  public static final int SUPPLIER = 4;
  public static final int STATUS = 5;
  public static final int ATTR1 = 6;
  public static final int ATTR2 = 7;
  public static final int ATTR3 = 8;
  public static final int ATTR4 = 9;
  public static final int ATTR5 = 10;
  public static final int PRODUCT = 11;
  public static final int ITEMSUPPLIER = 12;
  public static final int INVENTORY = 13;
  public static final int LINEITEM = 14;
  private static EntityDefImpl mDefinitionObject;

  /**
   * This is the default constructor (do not remove)
   */
  public ItemImpl() {
  }

  /**
   *
   *  Retrieves the definition object for this instance class.
   */
  public static synchronized EntityDefImpl getDefinitionObject() {
    if (mDefinitionObject == null) {
      mDefinitionObject = (EntityDefImpl) EntityDefImpl.findDefObject(
          "toystore.model.businessobjects.Item");
    }
    return mDefinitionObject;
  }
  /**
   * Gets the attribute value for Itemid, using the alias name Itemid
   */
  public String getItemid() {
    return (String) getAttributeInternal(ITEMID);
  }
  /**
   * Sets <code>value</code> as the attribute value for Itemid
   */
  public void setItemid(String value) {
    setAttributeInternal(ITEMID, value);
  }
  /**
   * Gets the attribute value for Productid, using the alias name Productid
   */
  public String getProductid() {
    return (String) getAttributeInternal(PRODUCTID);
  }
  /**
   * Sets <code>value</code> as the attribute value for Productid
   */
  public void setProductid(String value) {
    setAttributeInternal(PRODUCTID, value);
  }
  /**
   * Gets the attribute value for Listprice, using the alias name Listprice
   */
  public Number getListprice() {
    return (Number) getAttributeInternal(LISTPRICE);
  }
  /**
   * Sets <code>value</code> as the attribute value for Listprice
   */
  public void setListprice(Number value) {
    setAttributeInternal(LISTPRICE, value);
  }
  /**
   * Gets the attribute value for Unitcost, using the alias name Unitcost
   */
  public Number getUnitcost() {
    return (Number) getAttributeInternal(UNITCOST);
  }
  /**
   * Sets <code>value</code> as the attribute value for Unitcost
   */
  public void setUnitcost(Number value) {
    setAttributeInternal(UNITCOST, value);
  }
  /**
   * Gets the attribute value for Supplier, using the alias name Supplier
   */
  public Number getSupplier() {
    return (Number) getAttributeInternal(SUPPLIER);
  }
  /**
   * Sets <code>value</code> as the attribute value for Supplier
   */
  public void setSupplier(Number value) {
    setAttributeInternal(SUPPLIER, value);
  }
  /**
   * Gets the attribute value for Status, using the alias name Status
   */
  public String getStatus() {
    return (String) getAttributeInternal(STATUS);
  }
  /**
   * Sets <code>value</code> as the attribute value for Status
   */
  public void setStatus(String value) {
    setAttributeInternal(STATUS, value);
  }
  /**
   * Gets the attribute value for Attr1, using the alias name Attr1
   */
  public String getAttr1() {
    return (String) getAttributeInternal(ATTR1);
  }
  /**
   * Sets <code>value</code> as the attribute value for Attr1
   */
  public void setAttr1(String value) {
    setAttributeInternal(ATTR1, value);
  }
  /**
   * Gets the attribute value for Attr2, using the alias name Attr2
   */
  public String getAttr2() {
    return (String) getAttributeInternal(ATTR2);
  }
  /**
   * Sets <code>value</code> as the attribute value for Attr2
   */
  public void setAttr2(String value) {
    setAttributeInternal(ATTR2, value);
  }
  /**
   * Gets the attribute value for Attr3, using the alias name Attr3
   */
  public String getAttr3() {
    return (String) getAttributeInternal(ATTR3);
  }
  /**
   * Sets <code>value</code> as the attribute value for Attr3
   */
  public void setAttr3(String value) {
    setAttributeInternal(ATTR3, value);
  }
  /**
   * Gets the attribute value for Attr4, using the alias name Attr4
   */
  public String getAttr4() {
    return (String) getAttributeInternal(ATTR4);
  }
  /**
   * Sets <code>value</code> as the attribute value for Attr4
   */
  public void setAttr4(String value) {
    setAttributeInternal(ATTR4, value);
  }
  /**
   * Gets the attribute value for Attr5, using the alias name Attr5
   */
  public String getAttr5() {
    return (String) getAttributeInternal(ATTR5);
  }
  /**
   * Sets <code>value</code> as the attribute value for Attr5
   */
  public void setAttr5(String value) {
    setAttributeInternal(ATTR5, value);
  }
  /**
   * Gets the associated entity oracle.jbo.RowIterator
   */
  public InventoryImpl getInventory() {
    return (InventoryImpl) getAttributeInternal(INVENTORY);
  }
  /**
   * Gets the associated entity oracle.jbo.RowIterator
   */
  public RowIterator getLineitem() {
    return (RowIterator) getAttributeInternal(LINEITEM);
  }
  /**
   * Gets the associated entity ProductImpl
   */
  public ProductImpl getProduct() {
    return (ProductImpl) getAttributeInternal(PRODUCT);
  }
  /**
   * Sets <code>value</code> as the associated entity ProductImpl
   */
  public void setProduct(ProductImpl value) {
    setAttributeInternal(PRODUCT, value);
  }
  /**
   * Sets <code>value</code> as the associated entity InventoryImpl
   */
  public void setInventory(InventoryImpl value) {
    setAttributeInternal(INVENTORY, value);
  }
  //  Generated method. Do not modify.
  protected Object getAttrInvokeAccessor(int index, AttributeDefImpl attrDef)
    throws Exception {
    switch (index) {
    case ITEMID:
      return getItemid();
    case PRODUCTID:
      return getProductid();
    case LISTPRICE:
      return getListprice();
    case UNITCOST:
      return getUnitcost();
    case SUPPLIER:
      return getSupplier();
    case STATUS:
      return getStatus();
    case ATTR1:
      return getAttr1();
    case ATTR2:
      return getAttr2();
    case ATTR3:
      return getAttr3();
    case ATTR4:
      return getAttr4();
    case ATTR5:
      return getAttr5();
    case INVENTORY:
      return getInventory();
    case LINEITEM:
      return getLineitem();
    case PRODUCT:
      return getProduct();
    case ITEMSUPPLIER:
      return getItemSupplier();
    default:
      return super.getAttrInvokeAccessor(index, attrDef);
    }
  }
  //  Generated method. Do not modify.
  protected void setAttrInvokeAccessor(int index, Object value,
    AttributeDefImpl attrDef) throws Exception {
    switch (index) {
    case ITEMID:
      setItemid((String) value);
      return;
    case PRODUCTID:
      setProductid((String) value);
      return;
    case LISTPRICE:
      setListprice((Number) value);
      return;
    case UNITCOST:
      setUnitcost((Number) value);
      return;
    case SUPPLIER:
      setSupplier((Number) value);
      return;
    case STATUS:
      setStatus((String) value);
      return;
    case ATTR1:
      setAttr1((String) value);
      return;
    case ATTR2:
      setAttr2((String) value);
      return;
    case ATTR3:
      setAttr3((String) value);
      return;
    case ATTR4:
      setAttr4((String) value);
      return;
    case ATTR5:
      setAttr5((String) value);
      return;
    default:
      super.setAttrInvokeAccessor(index, value, attrDef);
      return;
    }
  }
  /**
   *
   *  Gets the associated entity SupplierImpl
   */
  public SupplierImpl getItemSupplier() {
    return (SupplierImpl) getAttributeInternal(ITEMSUPPLIER);
  }
  /**
   *
   *  Sets <code>value</code> as the associated entity SupplierImpl
   */
  public void setItemSupplier(SupplierImpl value) {
    setAttributeInternal(ITEMSUPPLIER, value);
  }
  /**
   *
   *  Creates a Key object based on given key constituents
   */
  public static Key createPrimaryKey(String itemid) {
    return new Key(new Object[] { itemid });
  }
}
