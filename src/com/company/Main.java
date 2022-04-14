package com.company;

import models.MyClass;

public class Main {

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.City = "New York";
        myClass.Company = "JPMorgan Chase";
        myClass.Country = "USA";
        myClass.Number = "+1 327 643 13 20";

        myClass.Delegate = (a, b) -> a + b;

        //var res = myClass.Delegate.Invoke("Hello ", "world!");
        myClass.InvokeSomeAction();
    }
}

