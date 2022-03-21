package com.company;


import models.Base;

public class Main {

    public static void main(String[] args) {
        System
        Base base = new Base();
        Base.Inner inner = base.new Inner("Name", base);
    }
}

