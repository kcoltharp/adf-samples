/* Copyright 2010, 2017, Oracle and/or its affiliates. All rights reserved. */
package oracle.fod.client;

import oracle.fod.common.EmpView;

import oracle.jbo.client.remote.ViewUsageImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class EmpViewClient extends ViewUsageImpl implements EmpView {
    /**This is the default constructor (do not remove).
     */
    public EmpViewClient() {
    }

    public void setNamesToFind(String[] names) {
        Object _ret = 
            getApplicationModuleProxy().riInvokeExportedMethod(this,"setNamesToFind",new String [] {"[Ljava.lang.String;"},new Object[] {names});
        return;
    }
}