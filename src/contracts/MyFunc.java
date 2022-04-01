package contracts;

@FunctionalInterface
public interface MyFunc<T> {
    T getValue(String value, String nextValue);

    default int someGetValue(String value){
        return Integer.getInteger(value);
    }
}
