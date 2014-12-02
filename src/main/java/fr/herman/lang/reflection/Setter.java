package fr.herman.lang.reflection;

public interface Setter<T, V> extends Consumer<T> {
    void setValue(T ref, V value);
}
