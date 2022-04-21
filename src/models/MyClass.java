package models;

import contracts.MyInterface;

public class MyClass implements MyInterface {

    private int myNumber;
    public String name;
    protected boolean value;

    public int getMyNumber() {
        return myNumber;
    }

    class InterClass{
        public int someNumber;

        public InterClass(int someNumber) {
            this.someNumber = someNumber;
        }
    }

    public void setMyNumber(int myNumber) {
        this.myNumber = myNumber;
    }

    public MyClass(){

    }
    public MyClass(int myNumber, String name, boolean value) {
        this.myNumber = myNumber;
        this.name = name;
        this.value = value;
    }

    public void getInfo(){
        System.out.println("Hello world!");
    }
}
