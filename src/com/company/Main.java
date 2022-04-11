package com.company;

import models.Base;
import models.BaseInherited;

import java.text.DecimalFormat;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import static java.util.function.Function.identity;

public class Main {

    public static void main(String[] args) {

//        Runnable runnable = () -> System.out.println("Hello world");
//        runnable.run();

//        Supplier<Integer> supplier = () -> 10;
//        var res = supplier.get();
//
//        Consumer<Integer> consumer = (Integer integer) -> System.out.println("Number " + integer);
//        Consumer<Integer> consumer1 = consumer.andThen((Integer myInt) -> {
//            System.out.println("Number is " + myInt);
//        });
//        //consumer.accept(50);
//        consumer1.accept(100);

//        BiConsumer<Integer, Base> biConsumer = (Integer integer, Base doubleVal) -> {
//            System.out.println("Number int is " + integer + ", number double is ");
//        };
//        var bi = biConsumer.andThen( (Integer int1, Base base) -> {
//            System.out.println("Number int is " + int1 + ", number double is base number");
//        });
//        bi.accept(10, new Base());

        Function<Integer, String> func = (Integer someVal) -> {
            return "The number is: " + someVal.toString();
        };

//        var function = Function.identity();
//        Object o = (Object)"My data string";
//        var resultInvocation = function.apply(o);

        var res = func.<Double>compose( (Double db) -> {
            return 10;
        });

        //var resOfInvocation = res.apply(500.0);
        var funcAndThen = res.<Double>andThen( (String str) -> {
            var length = (Integer) str.length();
            return (double) length;
        });

        var resAndThen = funcAndThen.apply(50.0);


    }
}

