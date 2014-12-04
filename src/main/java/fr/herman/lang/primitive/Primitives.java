package fr.herman.lang.primitive;

@SuppressWarnings("rawtypes")
public class Primitives {

    private Primitives() {
    }

    public static Class toWrapperClass(Class type) {
        if (type == int.class) {
            return Integer.class;
        } else if (type == float.class) {
            return Float.class;
        } else if (type == boolean.class) {
            return Boolean.class;
        } else if (type == long.class) {
            return Long.class;
        } else if (type == byte.class) {
            return Byte.class;
        } else if (type == char.class) {
            return Character.class;
        } else if (type == short.class) {
            return Short.class;
        } else if (type == double.class) {
            return Double.class;
        } else if (type == void.class) {
            return Void.class;
        }
        return null;
    }

    public static Class toPrimitiveClass(Class type) {
        if (type == Integer.class) {
            return int.class;
        } else if (type == Float.class) {
            return float.class;
        } else if (type == Boolean.class) {
            return boolean.class;
        } else if (type == Long.class) {
            return long.class;
        } else if (type == Byte.class) {
            return byte.class;
        } else if (type == Character.class) {
            return char.class;
        } else if (type == Short.class) {
            return short.class;
        } else if (type == Double.class) {
            return double.class;
        } else if (type == Void.class) {
            return void.class;
        }
        return null;
    }
}
