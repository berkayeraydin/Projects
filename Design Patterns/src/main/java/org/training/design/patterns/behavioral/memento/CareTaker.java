package org.training.design.patterns.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker<T> {
    private List<T> sessionMementos = new ArrayList<>();
    private AbstractSession<T>              webSession;

    public CareTaker(AbstractSession<T> webSession) {
        this.webSession = webSession;
    }

    public void save() {
        sessionMementos.add(webSession.save());
    }

    public void undo() {
        if (sessionMementos.size() > 0) {
            webSession.restore(sessionMementos.get(sessionMementos.size() - 1));
        }
    }

    public void restoreIndex(int index) {
        webSession.restore(sessionMementos.get(index - 1));
    }

    public void restore(int index) {
        webSession.restore(sessionMementos.get(sessionMementos.size() - index - 1));
    }

}
