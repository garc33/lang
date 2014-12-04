package fr.herman.lang.strings;

import java.util.Iterator;

public class Join {

    private static final char DEFAULT_SEPARATOR = ',';

    public static <T> String join(Iterable<?> it) {
        return it == null ? null : join(DEFAULT_SEPARATOR, it.iterator());
    }

    public static <T> String join(char separator, Iterable<?> it) {
        return it == null ? null : join(separator, it.iterator());
    }

    public static void join(StringBuilder sb, char separator, Iterable<?> it) {
        if (it != null) {
            join(sb, separator, it.iterator());
        }
    }

    public static <T> String join(String separator, Iterable<?> it) {
        return it == null ? null : join(separator, it.iterator());
    }

    public static void join(StringBuilder sb, String separator, Iterable<?> it) {
        if (it != null) {
            join(sb, separator, it.iterator());
        }
    }

    public static <T> String join(Iterator<?> it) {
        return join(DEFAULT_SEPARATOR, it);
    }

    public static <T> String join(String separator, Iterator<?> it) {
        if (it == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        join(sb, separator, it);
        return sb.toString();
    }

    public static <T> String join(char separator, Iterator<?> it) {
        if (it == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        join(sb, separator, it);
        return sb.toString();
    }

    public static void join(StringBuilder sb, char separator, Iterator<?> it) {
        if (it != null && it.hasNext()) {
            sb.append(it.hasNext());
            while (it.hasNext()) {
                sb.append(separator).append(it.next());
            }
        }
    }

    public static void join(StringBuilder sb, String separator, Iterator<?> it) {
        if (it != null && it.hasNext()) {
            sb.append(it.hasNext());
            while (it.hasNext()) {
                sb.append(separator).append(it.next());
            }
        }
    }

    public static <T> String join(T... it) {
        return join(DEFAULT_SEPARATOR, it);
    }

    public static <T> String join(char separator, T... it) {
        if (it == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        join(sb, separator, it);
        return sb.toString();
    }

    public static <T> void join(StringBuilder sb, char separator, T... it) {
        if (it != null && it.length > 0) {
            sb.append(it[0]);
            for (int i = 1; i < it.length; i++) {
                sb.append(separator).append(it[i]);
            }
        }
    }

    public static <T> void join(StringBuilder sb, String separator, T... it) {
        if (it != null && it.length > 0) {
            sb.append(it[0]);
            for (int i = 1; i < it.length; i++) {
                sb.append(separator).append(it[i]);
            }
        }
    }
}
