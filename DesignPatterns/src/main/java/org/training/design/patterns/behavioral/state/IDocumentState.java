package org.training.design.patterns.behavioral.state;

public interface IDocumentState extends IEditDoc{
    void open();
    void close();
    void lock();
    void unlock();
    EDocumentState docState();

}
