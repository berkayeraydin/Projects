package org.training.design.patterns.behavioral.state;

public class CloseState extends AbstractDocumentState {

    public CloseState(Document documentState) {
        super(documentState);
    }

    @Override
    public void open() {
        System.out.println("reopening document");
        documentState.setCurrentDocumentState(new OpenState(documentState));
    }

    @Override
    public void close() {

    }

    @Override
    public void lock() {
        System.out.println("locking document");
        documentState.setCurrentDocumentState(new LockState(documentState));

    }

    @Override
    public void unlock() {
        throw new IllegalStateException("You can not unlock closed document");

    }

    @Override
    public void add(String txt) {
        System.out.println("Close state de txt edit edilemez");
    }
}
