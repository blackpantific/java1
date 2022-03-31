package com.company;

import contracts.IntSequence;
import models.DigitSequence;
import models.SquareSequence;

public class Main {

    public static void main(String[] args) {
        IntSequence digits = new DigitSequence(1800);

        IntSequence.getInfo();//вызов стат метода, в c# тоже есть стат методы у интерфейса



        if(digits instanceof DigitSequence){
            DigitSequence digitSequence = (DigitSequence) digits;
        }

    }
}

