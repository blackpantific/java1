package models;

import contracts.MyFunc;

public class MyClass implements MyFunc<Integer> {
    @Override
    public Integer getValue(String value, String nextValue) {
        return 50;
    }

    @Override
    public int someGetValue(String value) {
        return MyFunc.super.someGetValue(value);
    }
}
