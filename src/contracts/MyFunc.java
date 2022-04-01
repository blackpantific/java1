package contracts;

@FunctionalInterface
public interface MyFunc<T> {
    T getValue(String value, String nextValue);
}
