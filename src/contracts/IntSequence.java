package contracts;

public interface IntSequence {
    int SOMECONST = 1;
    int SECOND = 2;

    boolean hasNext();

    default int defaultNext(){
        return 1;
    }

    int next();

    static void getInfo(){
        System.out.println("Hello world");
    }
}
