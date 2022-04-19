package com.company;

import contracts.MyInterface;

public class Main {

    public static void main(String[] args) {

    }

    //пример локального класса
    //локальный класс, это класс, созданный внутри метода
    public static MyInterface getInterfaceClassRealisation(){
        class MyClass implements MyInterface {

            @Override
            public void getInfo() {
                System.out.println("Output info about my program!");
            }
        }
        return new MyClass();
    }

    //пример анонимного класса
    public static MyInterface getAnonymousClass(){
        return new MyInterface() {
            @Override
            public void getInfo() {
                System.out.println("Output info with anonymous class!");
            }
        };
    }

    //аналог в лямбда-выражении
    public static MyInterface getLambdaAnalogue(){
        return () -> System.out.println("Output information from lambda expression!");
    }
}

