package models;

import java.awt.*;

public class MyClassInheritedFromAbstract extends SomeAbstractClass{
    @Override
    public void GetInfo() {
        System.out.println("Hello world");
    }

    @Override
    public int getId() {
        return 0;
    }
}
