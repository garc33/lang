package fr.herman.lang.reflection;

public interface Getter<T, V> extends Provider<T> {
    V getValue(T ref);
}
