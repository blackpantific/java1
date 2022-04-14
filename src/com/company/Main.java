package com.company;

import models.Base;
import models.BaseInherited;

import java.text.DecimalFormat;
import java.util.Comparator;
import java.util.Objects;
import java.util.function.*;

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

//        var res = func.<Double>compose( (Double db) -> {
//            return 10;
//        });
//
//        //var resOfInvocation = res.apply(500.0);
//        var funcAndThen = res.<Double>andThen( (String str) -> {
//            var length = (Integer) str.length();
//            return (double) length;
//        });
//
//        var resAndThen = funcAndThen.apply(50.0);

//        BiFunction<String, String, Integer> biFunction = (String str1, String str2) ->{
//            var str = str1 + str2;
//            var res = Integer.parseInt(str);
//            return res;
//        };

        //var res = biFunction.apply("1", "2");

//        biFunction.<Double>andThen( (Integer intVal) -> {
//            return intVal.doubleValue();
//        });

//        UnaryOperator<String> unaryOperator = (String str) -> str;
//        unaryOperator.apply("Hello world!");
//
//        BinaryOperator<String> binaryOperator = (String s1, String s2) -> s1 + s2;
//
//        Comparator<String> comparator = (String s1, String s2) -> {
//            if(s1.length() > s2.length()){
//                return 1;
//            }else if(s1.length() == s2.length()){
//                return 0;
//            }else if(s1.length() < s2.length()){
//                return -1;
//            }
//            return -1;
//        };
//
//        BinaryOperator<String> maxBy = BinaryOperator.maxBy(comparator);
//
//        var strRes = maxBy.apply("long string", "string");

        Predicate<Integer> predicate = (Integer intVal) -> {
            return intVal == 5;
        };

        var andPredicate = predicate.and( (Integer myVal) -> {
            return myVal !=0;
        });

        BiPredicate<Integer, Integer> biPredicate = (Integer int1, Integer int2) -> {
            if(int1 == int2){
                return true;
            }
            return false;
        };

        var resOfCompare = biPredicate.test(7,7);

        //может инвокаться в нестат классах
//        Function<Integer, String> muFunc = (Integer intVal) -> {
//            this.toString() + intVal.toString()
//        };



    }

    class MyClass {
        public MyClass() {
            //может инвокаться в нестат классах
            Function<Integer, String> myFunc = (Integer intVal) -> {
                return this.toString() + intVal.toString();
            };

            var myFuncRes = myFunc.apply(20);
        }
    }
}

