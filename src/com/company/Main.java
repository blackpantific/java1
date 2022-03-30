package com.company;

import models.Manager;
import models.User;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //User user = new User(new ArrayList<>());
//        user.add(new User.Model(){
//            public static void output(String name, int age){
//
//            }
//        });
        //так можно сделать если Model объявлен как public
//        User.Model model = new User.Model();
//        model.height = 178;
//        model.age = 23;
//        model.feetSize = 9;
//        model.weight = 50;
//
//        user.add(model);

        //МЫ НЕ МОЖЕМ СОЗДАТЬ ВНУТРЕННИЫЙ КЛАСС ЗА ПРЕДЕЛАМИ ВНЕШНЕГО
        //Manager.Model model = new Manager.Model();

        Manager manager = new Manager(new ArrayList<>());
        manager.add("candice", 176, 32, 48, 8);
        manager.add("adriana", 180, 36, 54, 10);
        manager.add("barbara", 176, 26, 54, 8);

        manager.displayAllModels();

        manager.modelsList.get(0).leave();

        System.out.println();
        manager.displayAllModels();

        //АЛЬТЕРНАТИВНЫЙ ВАРИАНТ С СОЗДАНИЕМ ВНУТРЕННЕГО КЛАССА БЕЗ ИСОПЛЬЗОВАНИЯ
        //СПЕЦИАЛЬНЫХ МЕТОДОВ ВНЕШНЕГО КЛАССА
        Manager.Model model = manager.new Model("Cara", 177, 29, 48, 7);
        var height = model.height;
    }
}

