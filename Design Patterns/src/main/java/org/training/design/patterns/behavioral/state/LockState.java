package org.training.design.patterns.behavioral.state;

public class LockState extends AbstractDocumentState {

    public LockState(Document documentState) {
        super(documentState);
    }

    @Override
    public void open() {
        throw new IllegalStateException("You can not open locked document");

    }

    @Override
    public void close() {
        throw new IllegalStateException("You can not close locked document");

    }

    @Override
    public void lock() {

    }

    @Override
    public void unlock() {
        System.out.println("close state trans");
        documentState.setCurrentDocumentState(new CloseState(documentState));
    }

    @Override
    public void add(String txt) {
        System.out.println("Lock state de txt edit edilemez. Unlock edin sonra open yapın");
    }

}
