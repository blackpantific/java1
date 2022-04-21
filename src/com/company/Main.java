package com.company;

import models.MyClass;
import models.MyGeneric;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws ReflectiveOperationException{

        MyClass myClass = new MyClass(7, "David", true);
        //MyGeneric<?> generic = new MyGeneric<>(myClass);
        Class<?> cl = myClass.getClass();
        var res = MyClass.class.getConstructor();
//        Class clsarray[] = new Class[] { String.class };  //creating array
//        Constructor cnstrctr = String.class.getConstructor(clsarray); //get the constructor
        //doSmth(5, 4, 3, 2);

        Class<?> cl1 = Class.forName(String.class.getName()); while (cl != null) {
            for (Method m : cl.getDeclaredMethods()) { System.out.println(
                    Modifier.toString(m.getModifiers()) + " " + m.getReturnType().getCanonicalName() + " " + m.getName() + Arrays.toString(m.getParameters()));
            }
            cl = cl.getSuperclass ();
        }
    }

    public static void doSmth(int... values){

        for (int i :
                values) {
            System.out.println(i);
        }
    }
}

