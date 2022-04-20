package com.company;

import models.Manager;
import models.Size;

public class Main {

    public static void main(String[] args) {
        Manager manager = new Manager();

        Size size = Size.LARGE;
        var position = size.ordinal();
        
    }
}

