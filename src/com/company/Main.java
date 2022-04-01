package com.company;

import contracts.MyFunc;
import contracts.MyFunctionalInterface;

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
    }

    public static void display(){
        System.out.println("New output info");
    }

    public static int getNumber(MyFunctionalInterface func){
        func.getInfo();
        return 1;
    }
}

