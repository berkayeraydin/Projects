package org.training.design.patterns.behavioral.state;

public abstract class AbstractDocumentState implements IDocumentState {
    protected Document       documentState;
    protected EDocumentState doctState;
    protected String         text = "";

    public AbstractDocumentState(Document documentState) {
        this.documentState = documentState;
        IDocumentState currentDocumentState = documentState.getCurrentDocumentState();
        if (this instanceof OpenState) {
            doctState = EDocumentState.OPEN;
        } else if (this instanceof CloseState) {
            doctState = EDocumentState.CLOSED;
        } else if (this instanceof LockState) {
            doctState = EDocumentState.LOCKED;
        }
        text = documentState.getText();
    }

    @Override
    public EDocumentState docState() {
        return doctState;
    }

    @Override
    public String getText() {
        return text;
    }
}