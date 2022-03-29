package models;

import java.util.ArrayList;
import java.util.Random;

public class User {
    private String name;
    private int id;
    //можно менять список, но не ссылку на список
    public final ArrayList<User> myUsersList = new ArrayList<User>();

    public static int postNumber;

    {//before ctor
        Random r = new Random();
        id = r.nextInt();
    }

    //зачем надо не оч понятно, но по идее такой блок нужен
    //для того, чтобы инициализировать в первый раз какие-то стат переменные при первом создании
    //экземпляра статического класса
    static {
        postNumber = 12;
    }


    public User() {
        Base b = new Base();//может быть создано внутри одного пакета
    }

    public User(String name){
        this();
    }
}
