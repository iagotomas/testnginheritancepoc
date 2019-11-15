package com.tomas.testngpoc;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public abstract class AbstractClass extends BaseTestClass
{


    @BeforeMethod(dependsOnMethods = "setUpAlways")
    public void setUp()
    {
        System.out.println(this.getClass().getSimpleName() + " - setUp");
    }

    @BeforeMethod(alwaysRun = true)
    public void setUpAlways()
    {
        System.out.println(this.getClass().getSimpleName() + " - setUpAlways");
    }

    @Test
    public void mainTestMethod()
    {
        System.out.println(this.getClass().getSimpleName() + " - mainTestMethod");
        execute();
    }

    public abstract void execute();

    @AfterMethod(dependsOnMethods = "tearDownAlways")
    public void tearDown()
    {
        System.out.println(this.getClass().getSimpleName() + " - tearDown");
    }

    @AfterMethod(alwaysRun = true)
    public void tearDownAlways()
    {
        System.out.println(this.getClass().getSimpleName() + " - tearDownAlways");
    }
}
