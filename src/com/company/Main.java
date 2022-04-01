package com.company;

import contracts.GetObject;
import contracts.MyFunc;
import contracts.MyFunctionalInterface;
import models.MyClass;
import models.SomeNewClass;

public class Main {

    public static void main(String[] args) {
        MyFunctionalInterface myFunctionalInterface = () -> System.out.println("Hello world");
        MyFunctionalInterface myFunctionalInterface1 = Main::display;

        myFunctionalInterface.getInfo();
        myFunctionalInterface1.getInfo();

        getNumber(() -> System.out.println("Hello world"));

        MyFunc<Integer> myFunc = (String a, String b) -> {
            return Integer.getInteger(a + b);
        };

        var testDefault = myFunc.someGetValue("12");

        MyClass myClass = new MyClass();
        myClass.getValue("a", "b");

        MyFunc<Integer> myFunc1 = myClass;
        myFunc1.someGetValue("12");

        GetObject<SomeNewClass> getObject = SomeNewClass::new;
        var res = getObject.getBack();
    }

    public static void display(){
        System.out.println("New output info");
    }

    public static int getNumber(MyFunctionalInterface func){
        func.getInfo();
        return 1;
    }
}

