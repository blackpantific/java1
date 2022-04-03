package com.company;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {

//        Runnable runnable = () -> System.out.println("Hello world");
//        runnable.run();

//        Supplier<Integer> supplier = () -> 10;
//        var res = supplier.get();
//
        Consumer<Integer> consumer = (Integer integer) -> System.out.println("Number " + integer);
        consumer.accept(50);

    }
}

