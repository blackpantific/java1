package models;

import contracts.MyDelegate;

import java.util.function.Function;

public class MyClass {
    public String Number;
    public String Name;
    public String Company;
    public String Country;
    public String City;

    public MyDelegate Delegate;

    public MyClass() {
    }

    public void InvokeSomeAction() {
        var res = Delegate.Invoke(this.Name, this.City);

    }
}
