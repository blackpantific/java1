package models;

import java.util.ArrayList;

public class Manager {

    //без модификатора static это уже внутренний класс, имеющий доступ к данным внешнего класса
    public class Model{
        public String name;
        public int height;
        public int age;
        public double weight;
        public double feetSize;

        public Model(String name, int height, int age, double weight, double feetSize) {
            this.name = name;
            this.height = height;
            this.age = age;
            this.weight = weight;
            this.feetSize = feetSize;
        }

        //доступ к полям внешнего класса
        public void leave(){
            modelsList.remove(this);
            //или же
            //Manager.this.modelsList.remove(this);
        }
    }

    public ArrayList<Manager.Model> modelsList;

    public Manager(ArrayList<Manager.Model> modelsList) {
        this.modelsList = modelsList;
    }

    public void add(String name, int height, int age, double weight, double feetSize){
        Model model = new Model(name, height, age, weight, feetSize);

        //ИЛИ ЖЕ АЛЬТЕРНАТИВНЫЙ ВАРИАНТ, хороший вариант приведен в классе Main
        Model model1 = this.new Model(name, height, age, weight, feetSize);
        modelsList.add(model);
    }

    public void displayAllModels(){
        for (var model:
             modelsList) {
            System.out.println(model.name);
        }
    }
}
