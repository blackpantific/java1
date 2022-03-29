package models;

public class Test {
    public String test;
    public Base base;

    public Test(String test) {
        this.test = test;

    }
}

class Base{
    public String base;
    private Test test;
}
