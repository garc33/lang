package fr.herman.lang.io;

import java.io.Closeable;

public class Closeables {
    private Closeables() {

    }

    public static void closeQuietly(Closeable closeable) {
        try {
            closeable.close();
        } catch (Throwable e) {

        }
    }
}
