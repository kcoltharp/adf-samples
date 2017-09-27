/* Copyright 2010, 2017, Oracle and/or its affiliates. All rights reserved. */
package test.hr.common;
import oracle.jbo.common.JboResourceBundle;
//  ---------------------------------------------------------------
//  ---    File generated by Oracle Business Components for Java.
//  ---------------------------------------------------------------

public class EmpImplMsgBundle extends JboResourceBundle 
{
  /**
   * 
   * This is the default constructor (do not remove)
   */
  public EmpImplMsgBundle()
  {
  }

  private static final char LOCALE_CURRENCY_SYMBOL = '\u00a4';
  /**
   * 
   * @return an array of key-value pairs.
   */
  public Object[][] getContents()
  {
    return super.getMergedArray(sMessageStrings, super.getContents());
  }

  static final Object[][] sMessageStrings = {
    {"Sal_TOOLTIP", "Monthly take-home pay for this employee before taxes"},
    {"Ename_LABEL", "Employee Name"},
    {"Job_LABEL", "Job Code"},
    {"Ename_TOOLTIP", "Name of the employee"},
    {"Deptno_TOOLTIP", "The department in which this employee works"},
    {"Empno_LABEL", "Employee Id"},
    {"Comm_TOOLTIP", "Commission level for sales over $500"},
    {"Sal_FMT_FORMAT", LOCALE_CURRENCY_SYMBOL+"0000.00"},
    {"Sal_LABEL", "Salary"},
    {"Hiredate_TOOLTIP", "Date on which the employee started work"},
    {"Hiredate_FMT_FORMAT", "dd-MMM-yyyy"},
    {"Hiredate_CONTROLTYPE", "103"},
    {"Empno_TOOLTIP", "The id number for the employee"},
    {"Sal_FMT_FORMATTER", "oracle.jbo.format.DefaultCurrencyFormatter"},
    {"Hiredate_FMT_FORMATTER", "oracle.jbo.format.DefaultDateFormatter"},
    {"Mgr_LABEL", "Manager Id"},
    {"Mgr_TOOLTIP", "Id of the employee's manager"},
    {"Job_TOOLTIP", "Code for the employee's job classification"},
    {"Deptno_LABEL", "Department Id"},
    {"Hiredate_LABEL", "Date of Hire"},
    {"Comm_LABEL", "Commission"}};










}
