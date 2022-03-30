package models;

import java.util.ArrayList;

public class User {

    //ВЛОЖЕННЫЙ СТАТИЧЕСКИ КЛАСС МАЛО ЧЕМ ОТЛИЧАЕТСЯ ОТ ОБЫЧНОГО
    //разве что мы четко видим при создании статически вложенного класса, что он
    //объявлен в другом классе
    private static class Model{
        public String name;
        public int height;
        public int age;
        public double weight;
        public double feetSize;
    }

    public ArrayList<Model> modelsList;

    public User(ArrayList<Model> modelsList) {
        this.modelsList = modelsList;
    }

    public void add(Model model){
        modelsList.add(model);
    }
}
