/* Copyright 2010, 2017, Oracle and/or its affiliates. All rights reserved. */
package test;

import oracle.jbo.AttributeDef;
import oracle.jbo.ViewLink;
import oracle.jbo.ViewObject;
import oracle.jbo.domain.Number;
import oracle.jbo.server.ApplicationModuleImpl;

import oracle.jbo.server.SQLBuilder;
import oracle.jbo.server.ViewDefImpl;

import oracle.jbo.server.ViewLinkDefImpl;

import oracle.jbo.server.ViewObjectImpl;

import test.common.AppModule;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class AppModuleImpl extends ApplicationModuleImpl implements AppModule {
    /**This is the default constructor (do not remove)
     */
    public AppModuleImpl() {
    }


    public void createViewObjectAndViewLinks() {
        // Create a new "myapp.DeptView" view definition
        ViewDefImpl deptViewDef = new ViewDefImpl("myapp.DeptView");
        // Define the names and types of the view attributes
        deptViewDef.addViewAttribute("Deptno","DEPTNO",Number.class);
        deptViewDef.addViewAttribute("Dname","DNAME",String.class);
        deptViewDef.addViewAttribute("Loc","LOC",String.class);
        // Define the SQL query that this view object will perform
        deptViewDef.setQuery("select deptno, dname, loc from dept");
        deptViewDef.setFullSql(true);
        deptViewDef.setBindingStyle(SQLBuilder.BINDING_STYLE_ORACLE_NAME);
        deptViewDef.setQueryHint(" MY_HINT ");
        deptViewDef.resolveDefObject();
        deptViewDef.registerDefObject();
        // Create an instance of the new view definition named "Departments"
        ViewObject deptView = createViewObject("Departments",deptViewDef);
        // Create a new "myapp.EmpView" view definition       
        ViewDefImpl empViewDef = new ViewDefImpl("myapp.EmpView");
        // Define the names and types of the view attributes
        empViewDef.addViewAttribute("Empno","EMPNO",Number.class);
        empViewDef.addViewAttribute("Ename","ENAME",String.class);
        empViewDef.addViewAttribute("Deptno","DEPTNO",String.class);
        // Define the SQL query that this view object will perform
        empViewDef.setQuery("select empno, ename, deptno from emp");
        empViewDef.setFullSql(true);
        empViewDef.setBindingStyle(SQLBuilder.BINDING_STYLE_ORACLE_NAME);
        empViewDef.resolveDefObject();
        empViewDef.registerDefObject();
        // Create an instance of the new view definition named "Departments"
        ViewObject empView = createViewObject("Employees",empViewDef);
        // Create a view link between these two new view instances
        ViewLink empsInDepartment = createViewLinkBetweenViewObjects("MyViewLink",
                                        "EmployeesInDepartment",
                                        deptView,
                                        new AttributeDef[]{
                                          deptView.findAttributeDef("Deptno")
                                        },
                                        empView,
                                        new AttributeDef[]{
                                          empView.findAttributeDef("Deptno")
                                        },
                                        "DEPTNO = :Bind_Deptno");
    }

    /**Sample main for debugging Business Components code using the tester.
     */
    public static void main(String[] args) {
        launchTester("test", /* package name */
      "AppModuleLocal" /* Configuration Name */);
    }
}
