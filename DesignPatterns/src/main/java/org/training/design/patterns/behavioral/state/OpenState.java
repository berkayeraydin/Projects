package org.training.design.patterns.behavioral.state;

public class OpenState extends AbstractDocumentState {

    public OpenState(Document documentState) {
        super(documentState);
    }

    @Override
    public void open() {

    }

    @Override
    public void close() {
        System.out.println("closing document");
        documentState.setCurrentDocumentState(new CloseState(documentState));
    }

    @Override
    public void lock() {
        throw new IllegalStateException("You can not lock opened document");
    }

    @Override
    public void unlock() {
        throw new IllegalStateException("You can not unlock opened document");

    }

    @Override
    public void add(String txt) {
        text += txt;
    }
}
