package org.training.design.patterns.behavioral.memento;

public abstract class AbstractSession<T> {

    private CareTaker<T> careTaker = new CareTaker<>(this);

    public void beginTrans(){
       careTaker.save();
    }

    public void commit(){

    }

    public void rollback(){
        careTaker.undo();
    }

    public void backup(){
        careTaker.save();
    }

    public void undo(){
        careTaker.undo();
    }

    public abstract T save();

    public abstract void restore(T webSessionMemento);

}
