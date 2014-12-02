package fr.herman.lang.transaction;

import java.util.concurrent.atomic.AtomicLong;

public class TransactionId {

    private final AtomicLong id;

    public TransactionId(long id) {
        this.id = new AtomicLong(id);
    }

    public long read() {
        return id.get();
    }

    public long write() {
        return id.incrementAndGet();
    }
}
