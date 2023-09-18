package org.training.design.patterns.behavioral.state;

public class Document implements IDocumentState {

    private IDocumentState currentDocumentState = new OpenState(this);

    @Override
    public void open() {
        currentDocumentState.open();
    }

    @Override
    public void close() {
        currentDocumentState.close();
    }

    @Override
    public void lock() {
        currentDocumentState.lock();
    }

    @Override
    public void unlock() {
        currentDocumentState.unlock();
    }

    @Override
    public EDocumentState docState() {
        return currentDocumentState.docState();
    }

    public void setCurrentDocumentState(IDocumentState currentDocumentState) {
        this.currentDocumentState = currentDocumentState;
    }

    public IDocumentState getCurrentDocumentState() {
        return currentDocumentState;
    }

    @Override
    public void add(String txt) {
        currentDocumentState.add(txt);
    }

    @Override
    public String getText() {
        if (currentDocumentState == null){
            return "";
        }
        return currentDocumentState.getText();
    }
}
