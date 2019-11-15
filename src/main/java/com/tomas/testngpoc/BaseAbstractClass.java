package com.tomas.testngpoc;

public abstract class BaseAbstractClass extends AbstractClass
{
    @Override
    public void execute()
    {
        System.out.println(this.getClass().getSimpleName() + " - execute");
    }
}
