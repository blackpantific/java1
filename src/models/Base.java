package models;

public class Base {
    String someName;

    public class Inner{
        String SomeInnerName;

        public Inner(String someInnerName, Base base) {
            SomeInnerName = someInnerName;
            if(base == Base.this){
                someName = "qwerty";
            }
        }
    }
}
