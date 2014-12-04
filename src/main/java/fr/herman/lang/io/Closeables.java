package fr.herman.lang.io;

import java.io.Closeable;
import java.io.IOException;

public class Closeables {
    private Closeables() {

    }

    public static void close(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException e) {

        }
    }

    public static void closeQuietly(Closeable closeable) {
        try {
            close(closeable);
        } catch (Throwable e) {

        }
    }
}
